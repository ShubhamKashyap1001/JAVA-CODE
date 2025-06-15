package functions;

// import java.util.*;

// public class CheckPrime {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the Number : ");
//         int n = input.nextInt();

//         boolean ans =  isPrime(n);
//         System.out.println(ans);
//     }

//     static boolean isPrime (int n){
//         if(n<=1){
//             return false;
//         }
//         int c = 2;
//         while(c*c<=n){
//             if(n%c==0){
//                 return false;
//             }
//             c++;
//         }
//         if(c*c > n){
//             return true;
//         }
//         return false;
//     }
// }

import java.util.*;

public class CheckPrime{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        if(ans == true){
            System.out.println(n +"is Prime Number");

        }
        else{
            System.out.println(n + "not prime");
        }
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        return false;
    }
}
