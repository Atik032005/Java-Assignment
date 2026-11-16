import java.util.Scanner;

public class Pyramid {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter number of raws
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Print Pyramid pattern
        for(int i = 1; i <= rows; i++) {

            // Print spaces before stars
            for(int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars in each raws
            for(int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        
    }
}
