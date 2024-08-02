import java.util.Scanner;

// import ejercicios.asteriscos;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input="";
        // cada q usemos el while true debemos de saber q tenemos un break
        while (true) {
            System.out.print("input: ");
            input = in.nextLine().trim().toLowerCase();

            if (input.equals("pass")) {
                continue;
            }
            if(input.equals("quit"))
                break;

            System.out.println(input);
            
        }

        String[] fruits = {"apple", "orange", "mango"};

        for (String f : fruits) 
            System.out.print(f+" ");        

            
        

        in.close();
    }
}
