package arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class matrices1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // valores predefinidos, esta es de 3x3
        // int matriz[][]={ {1,2,3},{4,5,6},{7,8,9} };

        int nfilas= Integer.parseInt(JOptionPane.showInputDialog("digita el numero de filas"));
        int nColumnas= Integer.parseInt(JOptionPane.showInputDialog("digita el numero de columnas"));

        int matriz[][]= new int[nfilas][nColumnas];

        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("["+i+"]["+j+"]: ");
                matriz[i][j] = in.nextInt();
            }
            // despues d cada vuelta es una nueva columna
        }

        // primer for para el numero de filas(3)
        for (int i = 0; i < nfilas; i++) {
            // segundo for para el numero de columnas:
            for (int j = 0; j < nColumnas; j++) { 
                System.out.print( matriz[i][j] +", " );
            }
            System.out.println("");
        }

        in.close();
    }
}
