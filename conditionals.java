import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        /* 
        * COMPARASION OPERATORS:
        * ==, <, <=, >=,!=,>=
        *  
        * LOGICAL OPERATORS:
        * &&, || , 

        30 hot day
        20 and 30 its a nice day
        its cold
        */
        Scanner in = new Scanner(System.in);
        // float temp=32;

        // if (temp>30) {
        //     System.out.println("it's a hot day");
        // // }else if(temp<30 && temp<20) {
        // }else if(temp<20) {
        //     System.out.println("it's a nice day");
        // }else{
        //     System.out.println("it's a cold day");
        // }

        // int income= 120_000;//120,000
        // // boolean hasHighIncome= false;
        // String className ; 
        // // if (income > 100_000 ) 
        // //     hasHighIncome=true;
        
        // // hasHighIncome=(income > 100_000 )? true : false;
        // // hasHighIncome=(income > 100_000 );
        // className=(income > 100_000 )? "first" : "economy";
        // // variable = (condition)? "value if it's true" : "value if it's false";
        // System.out.println(className);

        // String role="admin";

        // switch (role) {
        //     case "admin":
        //         System.out.println("you're an admin");
        //         break;
        //     case "user":
        //         System.out.println("you're an user");
        //         break;        
        //     default:
        //         System.out.println("you're a guest");//invitado
        //         break;
        // }

        // FizzBuzz
        System.out.print("Number: ");
        int number = in.nextInt();
        if (number%5==0) {
            System.out.print("Fizz");
        }
        if (number%3 == 0) {
            System.out.println("Buzz");
        }
        else if(number%5!=0 && number%3!=0 ) {
            System.out.println(number);
        }
        in.close();

    }
}
