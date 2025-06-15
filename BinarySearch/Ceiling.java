// // ceiling means: smallest number greater than or equal to target element

// public class Ceiling {
//     public static void main(String[] args) {
//         int[] arr = {2,4,6,15,17,18,20,24,44};
//         int target = 16;
//         int ans = checkCeiling(arr,target);
//         System.out.println(ans);
//     }

//     static int checkCeiling(int[] arr, int target){
//         if(target > arr[arr.length-1]){
//             return -1;
//         }
//         int start = 0;
//         int end = arr.length - 1;
//         while(start <= end){
//             int mid = start + (end - start)/2;
//             if(target > arr[mid]){
//                 start = mid + 1;

//             }
//             else if(arr[mid] > target){
//                 end = mid - 1;
//             }
//             else{
//                 // ans found
//                 return mid;
//             }
//         }
//         return start;
//     }
// }

public class Ceiling{
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,18,20,40,50};
        int target = 1150;
        int ans = checkCeiling(arr, target);
        System.out.println(ans);
    }

    static int checkCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length - 1]){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return start;
    }
}