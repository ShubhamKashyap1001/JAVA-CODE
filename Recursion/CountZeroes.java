public class CountZeroes {
    public static void main(String[] args) {
        int n = 230400510;
        System.out.println(count(n));
    }

    static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n,int digit){
        if(n == 0){
            return digit;
        }

        int rem = n%10;
        if(rem == 0){
            return helper(n/10, digit + 1);
        }
        return helper(n/10, digit);
    }
}
