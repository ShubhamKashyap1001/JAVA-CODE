import java.util.ArrayList;

public class FindAllDuplicateElement{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {2,4,1,1,4,5};
        System.out.println(findduplicateElement(arr));
    }

    public static ArrayList<Integer> findduplicateElement(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correctIndex = arr[i] - 1;
            //if(arr[i] != i+ 1){
                if(arr[i] != arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }
                //else{
                //    return arr[i];
                //}
            //}
            else{
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int index =0; index < arr.length ;index++){
            if(arr[index] != index+1){
                list.add(arr[index]);
            }
        }
        return list;
    }

    static void swap(int[] arr,int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}