public class ShiftOperator {
    public static void main(String [] args) {

        int number = 8;

        // Left shift operator (<<) shifts bits to the left
        int leftShift = number << 2;

        // Right shift operator (>>) shifts bits to the right
        int rightShift = number >> 2;

        // Display the results
        System.out.println("Orginal Number: " + number);
        System.out.println("After Left Shift: " + leftShift);
        System.out.println("After Right Shift: " + rightShift);
    }
}
