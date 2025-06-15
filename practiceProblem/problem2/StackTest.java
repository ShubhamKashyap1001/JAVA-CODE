package problem2;

//package practiceProblem.problem2;

import java.util.Scanner;

class Stack{
    private int[] stackArray;
    int top ;

    public Stack(int size){
        stackArray = new int[size];
        top = -1;
    }

    public void push(int value){
        if(top == stackArray.length - 1){
            System.out.println("Stack overflow");
        }else{
            stackArray[++top] = value;
        }
    }

    public void pop(){
        int top = -1;
        if( top == -1){
            System.out.println("Stack Underflow.");
        }else{
            System.out.println("popped : " + stackArray[top--]);
        }
    }

    public void display(){
        if(top == -1){
            System.out.println("Stack is Empty.");
        }
        else{
            System.out.println("Stack:");
            for(int i = 0; i<= top;i++){
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public int getSize(){
        return top + 1;
    }
}
public class StackTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack1 = new Stack(5);
        Stack stack2 = new Stack(5);

        while(true){
            System.out.println("1.push in stack1");
            System.out.println("2.push in stack2");
            System.out.println("3.pop in stack1");
            System.out.println("4.pop in stack2");
            System.out.println("5.display stack");
            System.out.println("6.Exit...");
            System.out.println("Choose your option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value for stact 1 : ");
                    stack1.push(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter value for stact 2 : ");
                    stack1.push(sc.nextInt());
                    break;
                case 3:
                    stack1.pop();
                    break;
                case 4:
                    stack2.pop();
                    break;

                case 5:
                    stack1.display();
                    stack2.display();
                    if(stack1.getSize() == stack2.getSize()){
                        System.out.println("Both have same size : " + stack1.getSize());
                    }
                    break;
            
                default:
                System.exit(0);
                    break;
            }
        }
    }
}
