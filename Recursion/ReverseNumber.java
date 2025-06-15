public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int ans = reverseNum(n);
        System.out.println(ans);
    }

    static int reverseNum(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
            
        }
        return ans;
    }
}
