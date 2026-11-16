import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user how many terms to print
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        // Print Fibonacci seris
        System.out.println("Fibonacci Series: ");

        for(int i = 1; i <= n; i++) {
            System.out.println(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }

       
    }
}
