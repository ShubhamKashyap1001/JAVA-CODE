// import java.util.Scanner;

// public class OrderAgnosticBS {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int[] arr = new int[10];
//         for(int i = 0;i< 10;i++){
//             arr[i] = in.nextInt();
//         }
//         System.out.println("Enter the target element in the arrays:");
//         int target = in.nextInt();
//         System.out.println(OrderAgnosticBS(arr,target));


//     }
//     static int OrderAgnosticBS(int[] arr, int target){
//         int start = 0;
//         int end = arr.length - 1;

//         boolean isAsc;
//         if(arr[start] > arr[end]){
//             isAsc = false;
//         }
//         else{
//             isAsc = true;
//         }

//         while ((start <= end)) {
//             int mid = start + (end - start)/2;
//             if(arr[mid] == target){
//                 return mid;
//             }

//             if(isAsc == true){
//                 if(arr[mid] < target){
//                     start = mid + 1;
//                 }
//                 else{
//                     end = mid - 1;
//                 }
//             }

//             else{
//                 if(arr[mid] > target){
//                     start = mid + 1;
//                 }
//                 else{
//                     end = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }
import java.util.Scanner;

public class OrderAgnosticBS{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr =new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = in.nextInt();
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }

        while(start <= end){
            int mid = start + (end- start)/2;
            if(target == arr[mid]){
                return mid;
            }

            if(isAsc == true){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
