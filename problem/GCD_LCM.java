import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a : ");
        int a = in.nextInt();
        System.out.print("b : ");
        int b = in.nextInt();
        System.out.println("GCD is :"+ gcd(a,b));
        System.out.println("LCM is :" + lcm(a,b));
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }

    // formula : - lcm(a,b) * hcf( a,b) = a * b
    static int lcm(int a, int b){
        return ((a * b)/ gcd(b%a,a));
    }
}
