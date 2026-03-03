import java.io.*;
import java.util.*;

class Student {
    private int rollNo;
    private String name;
    private float marks;

    // Method to input student details from user
    public void inputDetails(Scanner scanner) {
        try {
            System.out.print("Enter Roll No: ");
            rollNo = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Name: ");
            name = scanner.nextLine();

            System.out.print("Enter Marks: ");
            marks = Float.parseFloat(scanner.nextLine());

        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Invalid input. Please enter correct data types.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Convert student data to a string for file storage
    public String toFileString() {
        return rollNo + "," + name + "," + marks;
    }

    // Create student from string read from file
    public static Student fromFileString(String data) {
        String[] parts = data.split(",");
        Student s = new Student();
        try {
            s.rollNo = Integer.parseInt(parts[0]);
            s.name = parts[1];
            s.marks = Float.parseFloat(parts[2]);
        } catch (Exception e) {
            System.out.println("Error parsing student data: " + e.getMessage());
        }
        return s;
    }
}

public class StudentManager {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students from File");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Student s = new Student();
                    s.inputDetails(scanner);
                    saveToFile(s);
                    break;

                case "2":
                    readFromFile();
                    break;

                case "3":
                    continueInput = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    // Save student to file
    public static void saveToFile(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(student.toFileString());
            writer.newLine();
            System.out.println("Student details saved to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read and display all student records from file
    public static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Student Records ---");
            while ((line = reader.readLine()) != null) {
                Student s = Student.fromFileString(line);
                s.displayDetails();
                System.out.println("-------------------------");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
