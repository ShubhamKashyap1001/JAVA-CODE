public class Product {
    public static void main(String[] args) {
        int n = 5;
        //product(n);
        System.out.println(product(n));
    
    }

    static int product(int n){
        // int p = 1;
        // for(int i = 1 ; i <= 5;i++){
        //     p = p * i;
        // }
        // return p;

        if(n == 0){
            return 1;
        }

        return n * product(n-1);
    }
}
