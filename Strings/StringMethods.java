import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "  Shubham kashyap";
        System.out.println(name.charAt(4));
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('s'));
        System.out.println("   shubham   ".strip()); //strip also remove extra space from string 
        System.out.println(name.trim()); // trim also remove extra space in string
        System.out.println(Arrays.toString((name.split(" "))));
    }    
}
