public class CountStep {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(step(n));
    }

    static int step(int n){
        return helper(n,0);
    }

    private static int helper(int n,int steps){
        if(n==0){
            return steps;
        }

        //int rem  = n%10;
        if(n%2 == 0){
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);
    }
}
