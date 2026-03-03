import java.util.Scanner;

public class SumOfNnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        System.out.println("Sum of "+n + " number : "+ sum(n));
    }

    static int sum(int n){
        if(n == 0){
            return 1;
        }

        return n + sum(n-1);
    }
}
