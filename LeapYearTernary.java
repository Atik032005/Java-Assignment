import java.util.Scanner;

public class LeapYearTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check leap year using ternary operator
        String result = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        
        ? "Leap Year"
        : "Not a Leap Year";

        // Display the result
        System.out.println(year + " is " + result);

        

    }
}
