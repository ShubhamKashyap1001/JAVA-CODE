import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        //intialisation of 2d array
        int[][] num = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        //int[][] arr = new int[3][3];
        // here size of row is compulsory to give but col's size may be not fixed it can be variable

        //Input in 2d
        Scanner in = new Scanner(System.in);
        int[][] arrs = new int[3][3];
        //input
        for(int row = 0;row< arrs.length;row++){
            for(int col = 0;col<arrs[row].length;col++){
                arrs[row][col] = in.nextInt();
            }
        }

        //output(1)
        for(int row = 0;row<arrs.length;row++){
            for(int col = 0;col<arrs[row].length;col++ ){
                System.out.println(arrs[row][col]);
            }
        }
        //output(2)
        for (int row = 0; row < arrs.length; row++) {
            System.out.println(Arrays.toString(arrs[row]));
       }
        //ouput(3)
        for(int[] element: arrs){
            System.out.println(Arrays.toString(element));
        }
    }
}
