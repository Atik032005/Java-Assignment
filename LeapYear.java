import java.util.Scanner;
public class LeapYear {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check whether the year is a leap year or not
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {

            System.out.println(year + " Is a Leap Year");
        }

        else{
            System.out.println(year + " Is not a Leap Year");
        }

        
    }
}
