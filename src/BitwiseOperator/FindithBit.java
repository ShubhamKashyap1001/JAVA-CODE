

public class FindithBit {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findPosition(n));
    }

    static int findPosition(int n){                   // 1 0 1 1 0 1 1 0
        return (n & ( 1 << (n - 1)));                 // 0 0 0 1 0 0 0 0  -> this is called mask value
    }
}
