
public class Intervalo {
    public float limInicial;
    public float limFinal;

    public Intervalo(float ancho, float dMenor){
        limInicial=dMenor;
        limFinal=dMenor+ancho;
    }

    public String getString(){
        return limInicial+"-"+limFinal;
    }


}
