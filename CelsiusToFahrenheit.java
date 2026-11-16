import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter temperature in Celsius
        System.out.print("Enter Temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        // Convert Celsius to Fahrenheat
        double fahrenheat = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("Fahrenheat: "+fahrenheat);

        
    }
}