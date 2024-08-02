package arrays;

// import java.util.Scanner;

class arrays1 {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;

        for (int i = 0; i < numeros.length; i++){
            System.out.println( numeros[i] );
        }
        
        String[] nombres = {"pepe","dani"};
        for (String nom : nombres) {
            System.out.println(nom);
        }
    }

}