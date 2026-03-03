import java.util.Arrays;

public class DynamicArrays {
    public static void main(String[] args) {
        int[][] num= {
            {1,2,3,4},
            {5,6},
            {7,8,9},
        };
        for(int row=0;row<num.length;row++){
            for(int col = 0;col<num[row].length;col++){
                System.out.print(num[row][col] + " ");
            }
            System.out.println();
        }
        for(int row = 0; row < num.length ; row++){
            System.out.println(Arrays.toString(num[row]));
        }
        
    }
}
