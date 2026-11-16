import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // ask the user to enter three numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest;

        // Find the largest number
        if(a >= b && a >= c) {
            largest = a;
        }
        else if(b >= a && b >= c) {
            largest = b;
        }
        else {
            largest = c;
        }

        // Display the largest number
        System.out.println("Largest number is = " + largest);

        
    }
}
