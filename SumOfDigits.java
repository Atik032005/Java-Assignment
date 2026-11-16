import java.util.Scanner;

public class SumOfDigits {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        int number = sc.nextInt();

        int sum = 0;

        // Calculate the sum of digits
        while(number != 0) {
            int digit = number % 10;

            sum = sum +  digit;
            number = number / 10;
        }

        // Display the result
        System.out.println("Sum of digits = " + sum);

        
    }
}
