import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;


public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list.contains(25)); // 'contain' is use to identify that items is prisent or not
        System.out.println(list);

        list.set(0,9);
        System.out.println(list);
        
        list.remove(3);
        System.out.println(list);

        //input in list
        for(int i =0;i<5;i++){
            list.add(in.nextInt());
        }

        //output
        for(int i = 0;i<5;i++){
            System.out.println(list);
        }
    }
}
