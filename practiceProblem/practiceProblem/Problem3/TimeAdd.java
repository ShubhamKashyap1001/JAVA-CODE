package practiceProblem.Problem3;



class Time{
    private int h,m,s;

    Time(int h,int m,int s){
        this.h = h;
        this.m = m;
        this.s = s;

    }

    public void add(Time t){
        int totalsec = this.s + t.s;
        int totalmin = this.m + t.m + totalsec/60;
        int totalhour = this.h + t.h + totalmin/60;

        totalsec %= 60;
        totalmin %= 60;

        System.out.println("Total hour : " + totalhour + " Total min : " + totalmin + " Total sec :" + totalsec);
    }
}
public class TimeAdd {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(1, 45, 30);
        t1.add(t2);
    }
    
}
