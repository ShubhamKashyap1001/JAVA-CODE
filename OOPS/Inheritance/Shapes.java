//package OOPS.Inheritance;

public class Shapes {
    double side;
   // double side = 5;
    void area(){
        System.out.println("Area of Square is side * side .");
    }

    void area(double side){
        System.out.println("Area of Square is : " + (side * side));
    }


    public static void main(String[] args) {
        Shapes square = new Shapes();
        square.area();
        square.area(4);
    }
}
