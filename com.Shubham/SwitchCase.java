import java.util.*;

public class SwitchCase{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //String fruits = in.next();


        // switch(fruits){
        //     case "mangoes":
        //         System.out.println("A sweet and Yummy fruits");
        //         break;
        //     case "apples":
        //         System.out.println("A sweet and Yummy fruits");
        //         break;
        //     case "oranges":
        //         System.out.println("A sweet and Yummy fruits");
        //         break;
        //     case "grapes":
        //         System.out.println("A sweet and Yummy fruits");
        //         break;

        //     default:
        //         System.out.println("Invalid choice Please enter correct choice");
        // }

        // int day = in.nextInt();
        // switch(day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thrusday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default->System.out.println("Invalid choice");

        //}

        int day =in.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7->System.out.println("Weekend");
            default->System.out.println("Invalid choice");
        }


    }
}
