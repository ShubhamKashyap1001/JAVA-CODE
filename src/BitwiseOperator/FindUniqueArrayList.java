import java.util.ArrayList;
import java.util.Arrays;

public class FindUniqueArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,2,4,5,7));
        int uniqueNumber = findUnique(numbers);
        System.out.println("Unique Number is : " + uniqueNumber);
    }

    static int findUnique(ArrayList<Integer> numbers){
        int Unique = 0;
        for(int number : numbers){
            Unique ^= number;
        }
        return Unique;
    }
}
