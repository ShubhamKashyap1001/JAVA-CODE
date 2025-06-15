public class ProductOfDigit {
    public static void main(String[] args) {
        int n = 1234;
        int ans = product(n);
        System.out.println("Product of all digits : "+ ans);
    }

    static int product(int n){
        //base case
        if(n == 0){
            return 1;
        }

        return (n % 10) * product(n/10);
    }
}
