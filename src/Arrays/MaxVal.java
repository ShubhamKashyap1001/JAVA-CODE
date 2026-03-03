public class MaxVal {
    public static void main(String[] args) {
        int[] arr = {7,6,19,77,90,807,999};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
