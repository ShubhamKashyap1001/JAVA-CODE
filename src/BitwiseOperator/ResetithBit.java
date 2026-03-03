

public class ResetithBit {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(resetithBit(n));
    }

    static int resetithBit(int n){
        return (n & ~(1 << (n - 1)));

    }


}




