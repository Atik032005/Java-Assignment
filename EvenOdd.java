import java.util.Scanner;

public class EvenOdd {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check whether the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number +" Is an Even number");

        }

        else{
            System.out.println(number + " Is an Odd number");
        }

        
    }
}
