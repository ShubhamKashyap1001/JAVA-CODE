

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {4,2,6,4,2,1,1,7,7};
        System.out.println( "Unique Number is : " + (findUnique(arr)));
    }

    static int findUnique(int[] arr){
        int Unique = 0;
        for( int n : arr){
            Unique ^= n;  // we cane use xor here because xor operator give 0 with same combination of number such as ( 1 ^ 1 = 0 and 0 ^ 0 = 0)
        }
        return Unique;
    }
}
