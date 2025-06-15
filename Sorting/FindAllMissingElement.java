import java.util.ArrayList;

public class FindAllMissingElement{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {4,5,1};
        System.out.println(missingElement(arr));
    }

    public static ArrayList<Integer> missingElement(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] >= 1 && arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int index = 0;index < arr.length;index++){
            if(arr[index] != index+1){
                list.add(index+1);
            }
        }
        return list;
    }

    static void swap(int[] arr ,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}