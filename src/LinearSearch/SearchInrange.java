import java.util.Arrays;
import java.util.Scanner;

public class SearchInrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        for(int i = 0;i<num.length;i++){
            num[i] = in.nextInt();
        }
        System.out.println("Enter the staring Index:");
        int startIndex = in.nextInt();
        System.out.println("Enter the ending Index:");
        int endIndex = in.nextInt();
        
        System.out.println(Arrays.toString(num));
        System.out.println(maxInrange(num,startIndex,endIndex));

    }

    static int maxInrange(int[] arr,int startIndex,int endIndex){
        int max = arr[startIndex];
        for(int i = startIndex;i < endIndex ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
