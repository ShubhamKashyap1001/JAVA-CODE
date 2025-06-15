import java.util.Arrays;

public class setMismatched {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 2, 5, 3};
        System.out.println(Arrays.toString(findErrorNum(arr)));
    }

    public static int[] findErrorNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            // Fix to avoid ArrayIndexOutOfBoundsException
            if (arr[i] != arr[correctIndex] && arr[i] <= arr.length && arr[i] > 0) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
