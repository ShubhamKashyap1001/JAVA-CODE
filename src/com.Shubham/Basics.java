public class Basics {
    public static void main(String[] args) {
        //type conversion casting
        int num = (int)(65.89f);
        System.out.println(num);

        //automatic type promotion in expression
        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println(b);

        // float c = 234.656f;
        // int d = (int)(c);
        // System.out.println(d);

        // char ch = 'c';
        // int n = (int)(ch);
        // System.out.println(n);

        byte b = 42;
        byte c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);

        // all smaller one is converted into larger one 
    }
}
