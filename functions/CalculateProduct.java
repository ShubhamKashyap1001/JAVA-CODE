package functions;

import java.util.*;

public class CalculateProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = input.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = input.nextInt();

        int product=product(a,b);
        System.out.println("Product of Two Number is : "+ product);
    }

    static int product(int num1,int num2){
        int productOfTwoNumber = num1*num2;
        return productOfTwoNumber;
    }
}
