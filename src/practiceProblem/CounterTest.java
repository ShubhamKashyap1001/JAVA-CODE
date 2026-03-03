

//package practiceProblem;
class Counter{
    static int cnt = 0;

    public Counter(){
        cnt++;
    }

    public static void display(){
        System.out.println("Number of instance created : " + cnt);
    }
}
public class CounterTest {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        Counter.display();
    }
}
