package arrays;
import java.util.Scanner;
/* 
 * 
 * 
 */

public class busquedaSecuencial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int array[]={4,5,1,2,3};

        System.out.print("ingresa el dato a buscar: ");
        int dato= in.nextInt();
        boolean found=false;
         
        // busqueda:
        int i=0;
        while (i<array.length && !found ) {
            if (array[i]==dato) {
                found=true;
            }
            i++;
        }
        if (!found) {
            System.out.println("\nno se ja encontrado el dato en el array");
        }else{
            System.out.println("se ha encontrado el dato en el array, en la posicion: "+(i-1));
            // el i-1 porque el i++ esta por fuera del condicional por lo q se incrementa aunque ya se encuentre el dato
        }

        in.close();
    }
}
