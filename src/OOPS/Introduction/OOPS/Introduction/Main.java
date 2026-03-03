package OOPS.Introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = new String[5];

        //data of 5 student{rno,name,marks}

        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] student1 = new Student[5]; 
        //System.out.println(Arrays.toString(student1)); //here new is the dynamically allocated memory and return the refence variable to it
        //Student shubham;

        
        Student shubham = new Student();
        System.out.println(shubham.roll);

    }

    class Student{
        int roll;
        String name;
        float marks;
    }
}


//class is template of the object
//object is the instance of the class 
//class is the logiocal construct
//object is a physical reality.. that occupies space in memory
//referance variable is stored in stack memory
//object is store in heap memory
//variable inside the object is called instance variable
