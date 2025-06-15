public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,3};
        System.out.println(duplicateElement(arr));
    }

    static int duplicateElement(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != i+ 1){
                if(arr[i] != arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }
                else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return - 1;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
