import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        // Taking input from user

        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        // Store the orginal number

        int orginal = num;
        // Variable to store the reversed number

        int reverse = 0;
        // Reverse the number

        while (num != 0) {
            int digit = num % 10;
            // Build the reversed number

            num = num / 10;
            // Remove the last digit
        }
        // Check if the number is palindrome or not

        if (orginal == reverse) {
            System.out.println(orginal + " Is a palindrome number.");

        }
        else {
            System.out.println(orginal + " Is not a palindrome number.");
        } 
        
    }
}
