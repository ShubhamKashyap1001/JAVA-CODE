package functions;



import java.util.*;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        sum(a,b);
       
        System.out.println("Sum of Two number is: "+ (a+b));
    }

    static int sum(int num1,int num2){
        int sum = num1 + num2;
        //System.out.println("Sum of Two number is: "+ (a+b));
        return sum ;
    }
}
