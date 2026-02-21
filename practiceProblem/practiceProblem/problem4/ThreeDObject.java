package practiceProblem.problem4;//package practiceProblem.problem4;

abstract class ThreeDObject {
    abstract double surfaceArea(double l, double b, double h);

    abstract double volume(double l, double b, double h);

    abstract double surfaceArea();
    abstract double volume();


}

class Box extends ThreeDObject{
    double l,b,h;
    public Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    @Override
    double surfaceArea(double l,double b,double h){
        return 2 * (l*b+b*h+h*l);
    }

    @Override
    double volume(double l,double b,double h){
        return l * b * h;
    }

    @Override
    double surfaceArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'surfaceArea'");
    }

    @Override
    double volume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'volume'");
    }
    
}
