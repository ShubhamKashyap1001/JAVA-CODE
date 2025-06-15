

public class SearchInBinary {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,16,25,56,90};
        int target = 55;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if( target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
