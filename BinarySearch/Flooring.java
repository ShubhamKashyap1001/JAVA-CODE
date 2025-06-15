//greatest element less than or equal to target element

public class Flooring {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,18,20,24,40,50};
        int target = 15;
        int ans = checkFlooring(arr,target);
        System.out.println(ans);
    }

    static int checkFlooring(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[arr.length - 1]){
            return - 1;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return end;
    }
}
