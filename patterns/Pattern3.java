//package patterns;

import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int n = in.nextInt();
        System.out.print("Enter the value of column: ");
        int m = in.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }    
}
