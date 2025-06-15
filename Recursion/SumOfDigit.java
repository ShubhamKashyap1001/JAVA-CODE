public class SumOfDigit {
    public static void main(String[] args) {
        int n = 132;
        int ans = sumOfDigit(n);
        System.out.println("The sum of digit is : "+ ans);
    }

    static int sumOfDigit(int n){
        if(n == 0){
            return 0;
        }

        int rem = n % 10;
        return rem+ sumOfDigit(n/10);
    }
}
