public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,10,15,18,24,20,17,13,9,7};
        int target = 10;
        int ans = search(arr,target);
        System.out.println(ans); 
    }

    static int search(int[] arr, int target){
        int peak = searchPeakInMountainArray(arr, target);
        int firstTry = orderAgnosticBS(arr, target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        //try to search in se3cond half
        return orderAgnosticBS(arr, target,peak +1,arr.length - 1);
    }

    static int searchPeakInMountainArray(int[] arr, int taregt){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int  mid = start + (end - start)/2;
            if(arr[mid] > arr[mid +1]){
                // you are in descending part
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr,int target, int start,int end){

        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }

            if(isAsc == true){
                if(arr[mid] > target){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }

            else{
                if(arr[mid] < target){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
