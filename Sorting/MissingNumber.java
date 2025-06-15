public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,4,2,5,1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if( arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }

        //search missing element
        for(int index = 0;index < arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }
}
