import java.util.ArrayList;

public class TablaFrecuencias {
    public float dMayor,dMenor;
    public float rango;
    public int nIntervalos;
    public float anchoIntervalo;
    private ArrayList<Float> datos;

    public float frec[];
    public Intervalo intervalos[];
    public float fac[];
    public float frel[];
    public float fmc[];
    public float mClase[];
    public float angulo[];
    public float xi_x[];
    public float xi_x2[];
    public float media,moda,mediana;
    public float varianza,desviacion;

    public TablaFrecuencias(ArrayList<Float> nums){
        this.datos=nums;

        datos.sort(Float::compareTo);

        dMayor=datos.get(datos.size()-1);
        dMenor=datos.get(0);
        nIntervalos= (int) Math.round( 1+3.22*Math.log10( datos.size()) );
        
        intervalos=new Intervalo[nIntervalos];
        frec=new float[nIntervalos];
        fac=new float[nIntervalos];
        frel=new float[nIntervalos];
        mClase=new float[nIntervalos];
        angulo=new float[nIntervalos];
        fmc=new float[nIntervalos];
        xi_x=new float[nIntervalos];
        xi_x2=new float[nIntervalos];


        rango=dMayor-dMenor;

        if (tieneDecimales(datos)) {
            anchoIntervalo=rango/nIntervalos;            
        }else{
            anchoIntervalo= (int) Math.round(rango/nIntervalos) ;
        }

        frecuencia();

    }

    private void intervalos(){
        Intervalo inter= new Intervalo(anchoIntervalo, dMenor);
        for (int i = 0; i < intervalos.length; i++) {
            intervalos[i] = inter;
            inter= new Intervalo(anchoIntervalo, inter.limFinal );
        }
    }

    private void frecuencia(){
        intervalos();
        int i=0;
        for (Intervalo in : intervalos) {
           for (Float d : datos) {
                if (d >= in.limInicial && d<in.limFinal ) {
                    frec[i]+=1;
                }
           }
           i++;
        }
        frecAcum();
        frel();
        marcaClase();
        angulos();
        frecMC();
        calcMedia();
        calcModa();
        calcularMediana();
        calXi_x();
        calXi_x2();
        calVarianzaYDesv();
    }

    private void frecAcum(){
        fac[0] = frec[0];
        for (int i = 1; i < fac.length-1; i++) {
            fac[i] = frec[i]+fac[i-1];
        }
    }
    private void frel(){
        for (int i = 0; i < frec.length; i++) {
            frel[i] = frec[i]/datos.size();
        }
    } 

    private void marcaClase(){
        for (int i = 0; i < mClase.length; i++) {
            mClase[i]= (intervalos[i].limInicial+intervalos[i].limFinal)/2;
        }
    }
    private void angulos(){
        for (int i = 0; i < angulo.length; i++) {
            angulo[i] = frel[i]*360;
        }
    }

    private void frecMC(){
        for (int i = 0; i < fmc.length; i++) {
            fmc[i] = frec[i]*mClase[i];
        }
    }

    
    private void calXi_x(){
        for (int i = 0; i < xi_x.length; i++) {
            xi_x[i] = frec[i]-media;
        }
    }
    private void calXi_x2(){
        for (int i = 0; i < xi_x2.length; i++) {
            xi_x2[i] = (float) Math.pow(xi_x[i], 2);
        }
    }
    
    private void calcMedia(){
        float me=0;
        for (float f : fmc) {
            me+=f;
        }
        media= me/datos.size();
    }

    private void calcularMediana() {
        int n = datos.size();
        if (n % 2 != 0) 
            mediana = datos.get(n / 2);
         else 
            mediana = (datos.get(n / 2 - 1) + datos.get(n / 2)) / 2;
    }

    private void calcModa(){
        int iMayor=0;
        float max = frec[0];
        for (int i = 1; i < frec.length; i++) {
            if (frec[i] > max) {
                max = frec[i];
                iMayor = i;
            }
        }

        if (iMayor>0 && iMayor<frec.length) {
            float d1= frec[iMayor]-frec[iMayor-1];
            float d2= frec[iMayor]-frec[iMayor+1];
            
            moda= intervalos[iMayor].limInicial + ( d1/ (d1+d2) )*anchoIntervalo;
        }else{
            moda= calcularModa2(datos);
        }
    }

    private float calcularModa2(ArrayList<Float> nums) {
        ArrayList<Float> numerosUnicos = new ArrayList<>();
        ArrayList<Integer> frecuencias = new ArrayList<>();
        float moda = 0;
        int maxFrecuencia = 0;
        
        for (float num : nums) {
            int indice = numerosUnicos.indexOf(num);
            if (indice == -1) {
                numerosUnicos.add(num);
                frecuencias.add(1);
            } else {
                frecuencias.set(indice, frecuencias.get(indice) + 1);
            }
            if (frecuencias.get(indice) > maxFrecuencia) {
                maxFrecuencia = frecuencias.get(indice);
                moda = num;
            }
        }
        return moda;
    }
    
    private void calVarianzaYDesv(){
        float sum = 0;
        for (float x : xi_x2) {
            sum+=x;
        }
        varianza=sum/datos.size();
        desviacion=(float) Math.sqrt(varianza);
    }

    public void imprimirTablaFrecuencias() {
        System.out.println("Intervalo\tF\tFac\tFrel \tMC\tFrec \tÁngulo\tXi - X\t(Xi - X)^2");
        float facAcumulada = 0;
        for (int i = 0; i < intervalos.length; i++) {
            facAcumulada += frec[i];
            System.out.printf("%.2f - %.2f\t%.0f\t%.0f\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t%.2f\t\t%.2f\n",
                    intervalos[i].limInicial, intervalos[i].limFinal,
                    frec[i], facAcumulada, frel[i], mClase[i], fmc[i], angulo[i], xi_x[i], xi_x2[i]);
        }
    }
    
    
    
    private boolean tieneDecimales(ArrayList<Float> nums) {
        for (float num : nums) {
            String[] partes = Float.toString(num).split("\\.");
            if (partes.length > 1 && !partes[1].equals("0")) {
                return true;
            }
        }
        return false;
    }
    
    
    

}
