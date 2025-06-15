import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();
        int sumOfOddNum = printSum(n);
        System.out.println("Sum of odd number till n is : "+sumOfOddNum);
    }

        static int printSum(int n){
            int sum = 0;
            for(int i =1;i<=n;i++){
                if(i%2!=0){
                    sum = sum+i;
                }
            }
            return sum;
        }
    }

