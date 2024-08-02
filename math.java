
// import java.util.Scanner;
// import java.math.*;

class mate {
    public static void main(String[] args) {
        
        double x= (double) 10/3;//si no le ponemos el (double) nos dará un resultado entero 
        System.out.println("x:"+x);

        // implicit casting
        // byte-> short-> int-> long float-> double
        short a=1;
        int b=a+3;
        System.out.println("b: "+b);

        // explicit casting
        double d=1.1;
        int e= (int)d+3;
        System.out.println("e: "+e); 

        String s="12.1";
        double y= Double.parseDouble(s)+3;
        System.out.println("y: "+y); 

        // redondear al numero siguiente
        int r= (int)Math.ceil(1.1);
        System.out.println("ceil: "+r); //2
        
        // redondear al numero entero mas pequeño o igual a ese numero
         r= (int)Math.floor(1.9);
        System.out.println("floor: "+r); //1

        // max():
        r= Math.max(1, 2);
        System.out.println("max: "+r); //regresa el numero mayor

        // Math.sqrt() raiz cuadrada -> double
        double raiz = Math.sqrt(10);
        int raizEntera = (int) Math.sqrt(10);
        System.out.println("raiz decimal: " + raiz+ ", raiz entera " + raizEntera);

        // Math.pow(base, exponente) -> double
        double base = 5, exponente=3;
        double res=Math.pow(base,exponente);
        System.out.println("pow: "+res);
        
        // Math.round(double n) ->long     
        // Math.round(float n) ->int

        float n = 4.56f;
        res=Math.round(n);
        System.out.println("round: "+res);

        // Math.random: entre 0 y 1
        // res= Math.round( Math.random()*(maximo-minimo) + minimo ) ;
        res= Math.round(Math.random()*(100+1)) ;
        System.out.println("random: "+res);

        System.out.println(numeroRandom(1, 5));
    
    }

    /**
     * @param minimo rango minimo (incluyente)
     * @param maximo rango maximo (incluyente)
     * @return entero del
     */
    public static int numeroRandom(int minimo, int maximo){
        return (int) Math.round(Math.random()*(maximo-minimo) + minimo) ;
    }


}