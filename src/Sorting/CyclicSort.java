//element in array from range 0 to N or [0,n]

import java.util.Arrays;

public class CyclicSort{
    public static void main(String[] args) {
        int[] arr = {5,2,1,3,4};
        //System.out.println("Array before Sorting: "+arr);
        cyclicSort(arr);
        System.out.println("Arrays after Sorting:");
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int start,int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }
}