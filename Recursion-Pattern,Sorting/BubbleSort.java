import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,6};
        sorting(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr, int r, int c){
        if(r == 0){
            return  ;
        }

        if(c < r){
            if(arr[c] > arr[c+1]){
                //swap
                int temp = arr[c+1];
                arr[c+1] = arr[c];
                arr[c] = temp;
            }
            sorting(arr, r, c+1);
        }else{
            sorting(arr, r-1, 0);
        }
    }
    
}
