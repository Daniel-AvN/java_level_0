package arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;
/* 
 * ORDENAMIENTO POR INSERCION:
Es una manera muy natural de ordenar para un ser humano, y puede usarse fácilmente para ordenar un mazo de cartas numeradas en forma arbitraria. Requiere un (orden de n al cuadrado) O(n2) operaciones para ordenar una lista de n elementos.

Si numeroIzquierxa > numeroActual
            cambio

 */
public class ordenamientoPorInsercion {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int array[], nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el tamaño del array"));

        array= new int[nElementos]; //asignar el numero de elementos
         
        for (int i = 0; i < array.length; i++) {
            System.out.print("["+i+"]:");
            array[i] = in.nextInt();
        }

        // ordenamiento por insercion:
        int pos, aux;//posicion
        for (int i = 0; i < array.length; i++) {
            pos=i;
            aux = array[i];//el elemento actual

            while ( (pos>0) && (array[pos-1] > aux) ) {//l
                // pos>0 porque no hay ningún elemento antes y que el numero q esta en la izquierda sea mayor que el actual, por eso el -1
                array[pos]= array[pos-1];
                pos--;//que lo compruebe con los elementos a la izquierda, por eso el while va con pos>0
            }
            // cambiar el numero actual
            array[pos]=aux;

        }

        System.out.println("orden ascendente:");

        for (int a : array) {
            System.out.print(a+", ");   
        }

        System.out.println("\norden descendente:");
        for (int j = array.length-1; j >=0 ; j--) {
            System.out.print(array[j]+", ");   
        }


        in.close();
    }
}
