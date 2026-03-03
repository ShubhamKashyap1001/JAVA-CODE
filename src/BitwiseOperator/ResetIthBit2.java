import java.util.Scanner;

public class ResetIthBit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Prompt the user to enter the bit position (i)
        System.out.print("Enter the bit position (i) to reset: ");
        int i = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Reset the ith bit of the number
        int result = resetIthBit(number, i);

        // Display the result
        System.out.println("The number after resetting the " + i + "th bit is: " + result);
    }

    // Function to reset the ith bit of a number
    public static int resetIthBit(int num, int i) {
        // Create a mask with a 1 at the ith bit position
        int mask = 1 << (i - 1);

        // Invert the mask to have 0 at the ith bit position and 1s elsewhere
        int invertedMask = ~mask;

        // Perform bitwise AND between the number and the inverted mask to reset the ith bit
        return num & invertedMask;
    }
}
