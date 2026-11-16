import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a decimal number
        System.out.print("Enter a Decimal number: ");
        int number = input.nextInt();

        // Convert decimal to binary
        String binary = Integer.toBinaryString(number);

        // Display the binary number
        System.out.println("Binary: " +binary);

        
    }
}
