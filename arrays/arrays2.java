package arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

class arrays2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = Integer.parseInt(JOptionPane.showInputDialog("tamaño del array:"));

        char[] letras = new char[n];

        System.out.println("ingresa los elementos");
        for (int i = 0; i < n; i++){
            System.out.print( (i+1)+".-" );
            letras[i]= entrada.next().charAt(0);
        }

        System.out.println("\n los caracteres son:");

        for (int i = 0; i < n; i++){
            System.out.print( letras[i]);
            if (i<n-1 ) {
            System.out.print(", " );                
            }
        }
        entrada.close();    
        
    }

}