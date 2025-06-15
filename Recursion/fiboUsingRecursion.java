import java.util.Scanner;

public class fiboUsingRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of term :");
        int n = in.nextInt();
        //printFibo(n);
        System.out.println("Enter the fibonaccci number of " + n + " is:" + printFibo(n));
    }

    static int printFibo(int n){
        if(n <= 1){
            return n;
        }

        return printFibo(n-1) + printFibo(n-2);
    }
}
