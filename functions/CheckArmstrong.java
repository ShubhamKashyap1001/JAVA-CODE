package functions;

import java.util.*;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter the Number: ");
        //int n = in.nextInt();
        // boolean ans = printArmstrong(n);
        // System.out.println(ans);
        for(int i =100;i<=1000;i++){
            if(printArmstrong(i)){
                System.out.println(i+" ");
            }
        }
    }

    static boolean printArmstrong(int n){
        int originalVal = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        
        if(sum == originalVal){
            return true;
        }
        return false;
    }
}
