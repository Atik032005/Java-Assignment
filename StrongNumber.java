import java.util.Scanner;

public class StrongNumber {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Read the number
        int num = sc.nextInt();

        int orginal = num;
        int sum = 0;

        // Calculate the sum of factorials of digits
        while(num > 0) {
            int digit = num % 10;
            int factorial = 1;

            // Find factorial of the digit
            for(int i = 1; i<= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            num /= 10;
        }

        // Chack whether the number is a Strong number
        if(sum == orginal) {

            System.out.println(orginal + " is a Strong number");

        }

        else{
            System.out.println(orginal + " is not a Strong number");
        }

        
    }
}
