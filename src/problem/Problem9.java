import java.util.*;

public class Problem9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];                   // Array to store up to 100 numbers
        int count = 0;                                  // Counter for entered numbers

        System.out.println("Enter number ('s' for exit): ");

        while(true){
            System.out.println("Enter number: ");
            String input = sc.next();                   // Read input as String to check for quit option

            if(input.equalsIgnoreCase("s")){ 
                break;              // Exit loop if user types 'q'
            }
            try{
                int num = Integer.parseInt(input);      // Convert input to integer
                if(count<numbers.length){
                    numbers[count++] = num;   // Add number to array and increment count
                }
                else{
                    System.out.println("Maximum limit reached");
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid number");
            }

        }
        checkCount(numbers,count);

    }

    static void checkCount(int[] numbers,int size){
        int positiveCount = 0,negativeCount = 0, zeroesCount = 0;

        for(int i = 0;i<size;i++){
            if(numbers[i]>0){
                positiveCount++;
            }
            else if(numbers[i]<0){
                negativeCount++;
            }else{
                zeroesCount++;
            }
        }

        System.out.println("Positive Numbers is : "+positiveCount);
        System.out.println("negative Numbers is : "+negativeCount);
        System.out.println("zeroes Numbers is : "+zeroesCount);
    }
}