import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Ask the user to choose an operator
        System.out.print("Enter an operator (+,-,*,/): ");
        char operator = sc.next().charAt(0);
         
        double result;

        // Perform calculation using switch case
        switch(operator) {
            case '+':
            result = num1 + num2;

            System.out.println("Result = " + result);
            break;

            case '-':
            result = num1 - num2;

            System.out.println("Result = " + result);
            break;

            case '*':
                result = num1 * num2;

                System.out.println("Result = " + result);
                break;

                case '/':
                    if(num2 != 0) {
                        result = num1 / num2;

                        System.out.println("Result = " + result);

                    }
                    else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;

                    default:

                    System.out.println("Invalid");
        }
    }
}
