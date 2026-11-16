import java.util.Scanner;

public class StarTriangle {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Print stars triangle pattern
        for(int i = 1; i <= rows; i++) {

            // Print stars in each row
            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            // Move to the next line
            System.out.println();
        }

        
    }
}
