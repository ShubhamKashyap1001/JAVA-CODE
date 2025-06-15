//package problem;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("enter operators:");
            char op = sc.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op =='-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter two number:");
                int a = sc.nextInt();
                int b = sc.nextInt();                

                if(op == '+'){
                    ans = a+b;
                }
                if(op == '-'){
                    ans = a-b;
                }
                if(op == '*'){
                    ans = a*b;
                }
                if(op == '/'){
                    if(b!=0){
                    ans = a/b;
                    }
                    
                }
                if(op == '%'){
                    ans = a%b;
                }
            }

            else if (op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid Operator");
            }
            System.out.println("Enter answer "+ ans);
        }
    }
}    

