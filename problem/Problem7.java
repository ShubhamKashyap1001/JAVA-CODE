import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n = in.nextInt();
        System.out.println("Enter 2nd number:");
        int m = in.nextInt();

        int grestestNum = printGreatestNum(n,m);
        System.out.println("The greatest number between " + n + " and " + m + " is : "+grestestNum);
    }

    static int printGreatestNum(int n,int m){
        return (n > m) ? n : m;

    }
}
