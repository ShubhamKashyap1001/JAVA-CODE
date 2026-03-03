//import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,17,54};
        int target = 17;
        System.out.println(linearSearch(arr,target));
    }
    static boolean linearSearch(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
