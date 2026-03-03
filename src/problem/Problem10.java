import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = in.nextInt();
        int fibo = calculateFibonacci(n);
        System.out.println("Fibonacci series is : "+ fibo);
    }
    
    static int calculateFibonacci(int n){
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        return b;
    }
}
