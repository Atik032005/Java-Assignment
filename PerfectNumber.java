import java.util.Scanner;

public class PerfectNumber {
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Find the dum of proper divisors of the number
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum = sum + i;
            }


        }

        // Check whether the number is perfect number or not
        if(sum == number) {
            System.out.println(number + "is a Perfect Number");
        }
        else{
            System.out.println(number + "is not a Perfect Number");
        }

        
    }
}