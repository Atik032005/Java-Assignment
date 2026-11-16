import java.util.Scanner;

public class SeriesSum {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        double sum = 0;

        // Calculate the series sum
        for(int i = 1; i <= n; i++) {
            sum = sum + (double) i / Math.pow(2, i);
        }

        // Display the result
        System.out.println("Sum of series = " + sum);

       
    }
}
