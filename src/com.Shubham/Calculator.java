import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter value of a:");
        int a = input.nextInt();
        System.out.println("Please Enter value of b:");
        int b = input.nextInt();
        System.out.println("Please enter your choice:");
        int choice = input.nextInt();
        switch(choice){
            case 1 : System.out.println("a + b = "+ a+b);
            break;
            //case 2 : System.out.println("a - b = "+ a - b);
            //break;
            case 3 : System.out.println("a * b = "+ a*b);
            break;
            case 4 : System.out.println("a / b = "+ a/b);
            break;
            case 5 : System.out.println("a % b = "+ a%b);
            break;
            default : System.out.println("Invalid choice");
        }
        
    }
}
