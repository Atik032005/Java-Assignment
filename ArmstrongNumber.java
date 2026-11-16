import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Read a number from the user
        int num = input.nextInt();

        int orginal = num;
        int sum = 0;

        // Calculate the sum of cubes of digits
        while (num > 0) {
            int digit = num % 10;
            sum += digit*digit*digit;
            num /= 10;
        }

        // Check whether the number is an Armstrong number
        if(sum == orginal){
            System.out.println(orginal +" Is an Armstrong number");
        }
        else {
            System.out.println(orginal +" Is not an Armstrong number");

        }
        
        
    }
}
