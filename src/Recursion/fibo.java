import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the term:");
        int n = in.nextInt();
        System.out.println("Enter the fibonacci series:");
        printFibo(n);
    }

    static void printFibo(int term){
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i = 0; i < term ; i++){
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm; 
        }
    }
}
