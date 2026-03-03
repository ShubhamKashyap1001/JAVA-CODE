import java.util.ArrayList;

public class FindElementUsingArrayList {
    public static void main(String[] args) {
        int[] arr = {2,4,6,4,4,9,7};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0,list);
        System.out.println(ans);
    }

    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }
}
