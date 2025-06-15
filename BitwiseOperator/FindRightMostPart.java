//rightmostsetbit means that where 1 is coming firstly from last first

public class FindRightMostPart {
    public static void main(String[] args) {
        int n = 52;
        int position  =  findPosition(n);
        if(position != -1){
            System.out.println("The position of rightmost set bit in " + n + " is : " + position);
        }
        else{
            System.out.println("there is no right set bit number" + n +" ");
        }
    }

    static int findPosition(int n){
        if( n == 0){
            return -1;

        }

        int position = 0;
        while((n & 1) == 0){
            n >>= 1;
            position ++;
        }
        return position;
    }
}
