import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndexElement(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int getMaxIndexElement(int[] arr,int start , int end){
        int max = start;
        for(int i = start;i<=end;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    // static int getMaxIndexElement(int[] arr,int start,int last){
    //     int max = arr[0];
    //     for(int i = 0;i<=last;i++){
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }
    //     }
    //     return max;
    // }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}