import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = in.nextInt();
        System.out.print("Enter 2nd number:");
        int b = in.nextInt();
        System.out.print("Enter 3rd number:");
        int c = in.nextInt();
        int average = printAverage(a,b,c);
        System.out.println("Average is : "+average);
    }

    static int printAverage(int num1,int num2,int num3){
        int average = (num1+num2+num3)/3;
        return average;
    }
}
