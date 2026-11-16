

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String [] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read a number from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Assume the number is prime
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            isPrime = false;
        } else {

            // Check divisibility from 2 to n/2
            for (int i = 2; i <= n / 2; i++) {

                // If divisible, it is not prime
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }


    }
}


