import java.util.Scanner;

public class LCM {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int lcm;

        // Find LCM using loop
        lcm = (num1 > num2) ?
        num1 : num2;

        while(true) {
            if(lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm++;

        }

        // Display the result
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);

        
    }
}
