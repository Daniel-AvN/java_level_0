package arrays;
import java.util.Scanner;
/* 
 * 
 * 
 */

import javax.swing.JOptionPane;


public class burbuja1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Object grupo[] = new Object[5];
        int array[], nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el tamaño del array"));

        array= new int[nElementos]; //asignar el numero de elementos
         

        for (int i = 0; i < array.length; i++) {
            System.out.print("["+i+"]:");
            array[i] = in.nextInt();
        }

        // metodo burbuja
        int aux=0;//auxiliar

        for (int i = 0; i < array.length-1; i++) {
            // el primer for para saber cuantas vueltas tiene que dar, el -1
            for (int j = 0; j < array.length-1; j++) {
                // segundo for para ordenar el array

                // ordenar de forma CRECIENTE:
                if (array[j] > array[j+1] ) {
                    // si el actual es mayor al siguiente
                    aux = array[j] ;
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
            
        }

        System.out.println("ordenado de forma creciente:");

        for (int a : array) {
            System.out.print(a+", ");
        }

        System.out.println("\nordenado de forma decreciente:");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }

        in.close();
    }
}
