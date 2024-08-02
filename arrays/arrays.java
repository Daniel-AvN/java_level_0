package arrays;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // int[] numbers = new int[5];
        // numbers[0] =1;
        // numbers[10] =4;//errror
        // System.out.println(numbers);//id del array: [I@76ed5528

        // en un array de boolean los valores predeterminados son false, de int son 0, de string como empty string

        int[] numbers = {8,3,9,2,6};
        // ordenar array de menor a mayor
        Arrays.sort(numbers);

        System.out.println( Arrays.toString(numbers) );//id del array
    }
}
