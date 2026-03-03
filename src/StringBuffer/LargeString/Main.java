package StringBuffer.LargeString;

import java.util.Arrays;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        //constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        //constructor 2
        StringBuffer sb2 = new StringBuffer(30);
        System.out.println(sb2.capacity());

        //constructor 3
        StringBuffer sb3 = new StringBuffer("Shubham kashyap");

        sb.append(("Shubham"));
        sb.append(" is nice !!");

        //sb.delete(1,5);
        sb.reverse();


        String str = sb.toString();
        System.out.println(str);

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println("Random String :" + name);

        //remove extra space b/w words in sentance
        String sentance = "Hi, My n ame  is    shubham kash  yap";
        System.out.println("Original sentance : "+ sentance);

        System.out.println(sentance.replaceAll("\\s",""));

        //split
        String arr = "kashyap, adarsh, raj, shekhar";
        String[] names = arr.split((","));
        System.out.println(Arrays.toString(names));

        //roundoff
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.2));

    }
}
