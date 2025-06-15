import java.util.*;

public class Problem8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float r = in.nextFloat();
        float circumference = printCircumference(r);
        float area = printArea(r);
        System.out.println("Circumferenece of a circle having "+ r + " radius is : " + circumference);
        System.out.println("Area  of circle is : " + area);
    }

    static float printCircumference(Float n){
        float circum = 2 * (22/7) * n;
        return circum;
    }

    static float printArea(float n){
        float area = (22/7) * n *n ;
        return area;
    }
}
