// //package OOPS.Inheritance;

// abstract class Shapes {
//     abstract double area();
//     abstract double perimeter();


// }

// class Square extends Shapes{
//     double side;

//     Square(double side){
//         this.side = side;
//     }

//     double area(){
//         return side * side;
//     }
//     double perimeter(){
//         return (4 * side);
//     }
// }

// class Rectangle extends Shapes{
//     double l;
//     double b;

//     Rectangle(double l, double h){
//         this.l = l;
//         this.b = b;
//     }

//     double area(double l, double b){
//         return l * b;
//     }

//     double perimeter(double l , double h){
//         return (2 *(l + b));
//     }
// }

// public class Shape{
//     public static void main(String[] args) {
//         Square s1 = new Square(4);
//         Rectangle s2 = new Rectangle(4,6);

//         System.out.println("Area is : " + s1.area());
//         System.out.println("Area is : " + s2.area());
//     }
// }


// Base class
abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

// Square class
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}

// Triangle class
class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double perimeter() {
        return a + b + c;
    }

    @Override
    double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Using Heron's formula
    }
}

// Main class to test
public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Square Area: " + square.area() + ", Perimeter: " + square.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());
        System.out.println("Triangle Area: " + triangle.area() + ", Perimeter: " + triangle.perimeter());
    }
}   