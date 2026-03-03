
public class Comparison {
    public static void main(String[] args) {
        String name1 = "shubham";
        String name2 = "shubham";
        String name3 = name1;
        //true becoz in this case ref  variable name1 and name2 both pointing toward same object in heap memory "shubham"
        System.out.println(name1 == name2);
        System.out.println(name3 == name2);

        //create different object of the same value
        String a = new String("Shubham");
        String b = new String("Shubham");

        System.out.println(a == b);
        // here (.equal) is used to compare the value 
        System.out.println(a.equals(b));
    }
}
