public class LocalInstanceVariable {

    // Instance variable
    int number = 10;

    // Method to show variables
    void display() {

        // Local variable
        int value = 20;

        // Display instance and local variable
        System.out.println("Instance Variable: " + number);

        System.out.println("Local Variable: " + value);
    }

    public static void main(String [] args) {
        // Create object of the class
        LocalInstanceVariable obj = new LocalInstanceVariable();

        // Call the method
        obj.display();
    }
}


