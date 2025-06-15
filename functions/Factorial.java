package functions;

//package functions;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = input.nextInt();
        int factorial= printFactorial(n);
        System.out.println("factorial of the number is : "+ factorial);
    }    

    static int printFactorial(int num){
        if(num<0){
            System.out.println("Invalid Number");
            return 0;
        }
            int factorial = 1;
            for(int i =num;i>=1;i--){
                factorial = factorial*i;
            }
        return factorial;
        
    }
}
