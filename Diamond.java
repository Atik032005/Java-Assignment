import java.util.Scanner;

public class Diamond {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // ask the user to enter number of rows
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        // Print upper half of diamond
        for(int i = 1; i <= rows; i++) {

            // Print spaces before stars
            for(int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // print stars in each row
            for(int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Print lower half of the diamond
        for(int i = rows - 1; i >= 1; i--) {

            // Print spaces before stars
            for(int j = rows; j > i; j--) {
                System.out.print(" "); 
            }

        // Print stars in each row
        for(int j = 1; j <= (2 * i - 1); j++) {
            System.out.print("*");
        }

        // Move to the next line
        System.out.println();
    }

    
}

}


