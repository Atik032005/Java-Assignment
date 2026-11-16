import java.util.Scanner;

public class PasswordCheck {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "1234";
        String password;

        // Ask the user to enter password until it is correct
        do {
            System.out.print("Enter a four digit password: ");
            password = sc.nextLine();

            // Check password
            if(!password.equals(correctPassword)) {
                System.out.println("Wrong password! Try again.");
            }

        }

        while(!password.equals(correctPassword));

        // Display succes message
        System.out.println("Login succesful");
    }
}
