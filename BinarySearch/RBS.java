public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        //int[] arr = {1,2,3,4,5,6};
        System.out.println(findPivot(arr));
    }

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);

        //if you did not find pivot , it means there is no rotation in array
        if(pivot == -1){
            //just do normal binary search
            return binarySearch(arr, target, target, arr.length - 1);
        }

        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr, target, target, pivot - 1);
        }
        else{
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int binarySearch(int[] arr, int target,int start,int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            // 4 cases
            if(end > mid && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(start < mid && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            else if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
