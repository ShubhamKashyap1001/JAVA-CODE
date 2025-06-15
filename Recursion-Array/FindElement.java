import java.util.ArrayList;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {4,2,8,6,9,14,1,2};
        System.out.println(isFind(arr,22,0));
        System.out.println(findIndex(arr,6,0));
        System.out.println(findIndexLast(arr,14,6));
        // findAllIndex(arr, 2, 0);
        // System.out.println(list);
    }    

    static boolean isFind(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || isFind(arr, target, index+1);
    }

    static int findIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }

    static int findIndexLast(int[] arr,int target,int index){
        if(index == -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return findIndexLast(arr, target, index-1);
    }

    static ArrayList<Integer>list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

}
