import java.util.Scanner;

public class Factorial {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        //Ask the user to enter a number
        System.out.print("Enter a number: ");

        int number = input.nextInt();

        long factorial = 1;

        // Calculate the factorial of the number
        for(int i = 1; i <= number; i++) {
            factorial = factorial * i; 
        }


            // Display the result
            System.out.println("Factorial of " + number + " = " + factorial);
        
    }
}
