//import java.util.ArrayList;

class FindDuplicate {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {2,4,3,2,7};
        System.out.println("Duplicate Number : " + (findDuplicate(arr)));
    }

    static int findDuplicate(int[] arr){
        int duplicate = 0;
        for(int n : arr){
            duplicate ^= n;
        }

        for(int i = 1; i <= arr.length - 1 ; i++){
            duplicate ^= i;
        }

        return duplicate;
    }
}
