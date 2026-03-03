public class Reverse {

    static int sum = 0;
    static void rev1(int n){
        if(n == 0){
            return;
        }

        int rem = n%10;
        sum = sum * 10 + rem;
        //n = n/10;
        rev1(n/10);
        
    }


    static int rev2(int n){
        int digit = (int)(Math.log10(n))+1;
        return helper(n, digit);
    }

    private static int helper(int n,int digit){
        if(n%10 == n){
            return n;
        }

        int rem = n % 10;
        return rem * (int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
    }
    public static void main(String[] args) {
        //int n = 1234;
        //rev1(n);
        //System.out.println(sum);
        System.out.println(rev2(1234));
    }


}
