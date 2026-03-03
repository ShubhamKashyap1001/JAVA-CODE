import java.util.*;

public class GCDcalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        int gcd = calculateGCD(num1,num2);
        System.out.println("The GCD of "+ num1 + " and "+ num2 + " is : "+gcd);
    }

    static int calculateGCD(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
