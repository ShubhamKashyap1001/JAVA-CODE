import java.util.*;

public class Count{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter found repeating elemnet:");
        int b = input.nextInt();
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == b){
                count++;
            }
            n = n/10;


        }
        System.out.println(count);
    }
}