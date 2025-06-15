import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int numberOfTerms = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Print the Fibonacci sequence
        System.out.println("Fibonacci sequence up to " + numberOfTerms + " terms:");
        printFibonacci(numberOfTerms);
    }

    // Function to print the Fibonacci sequence
    public static void printFibonacci(int terms) {
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
