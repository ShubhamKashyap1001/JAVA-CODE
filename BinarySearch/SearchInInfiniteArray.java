public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,16,18,20,22,24,25,26,27,30,35,38,40,48,50,52,54,56,58,60,61,62,64,67,69,70};
        int target = 40;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + ( end - start + 1)*2;
            start = newStart;
        }
        return searchInfinite(arr, target, start, end);
    }

    static int searchInfinite(int[] arr,int target, int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
