package functions;

// In variable argument, we can call one same type of function in multiple type which also show that we can use infinte integer,string .. ect argument to call the function 
//we can understand its with below example;


import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8);
        fun("shubham","abhishek","lucky","adarsh");
        multiple(2,3,4,"shubham","lucky","sneha","abhishek");
        demo(2,3,4,5,90);
        //demo("Shubham","kashyap","raj","adarsh");
    }    
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a,int b,int c, String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
