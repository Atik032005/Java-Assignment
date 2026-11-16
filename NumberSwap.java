import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask the user to enter two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Display numbers before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the numbers using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Display numbers after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);

        
    }
}
