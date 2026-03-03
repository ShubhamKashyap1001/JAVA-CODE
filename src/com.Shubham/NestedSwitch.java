import java.util.*;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpId = in.nextInt();
       

        switch(EmpId){
            case 1 -> System.out.println("Shubham kumar");
            case 2 -> System.out.println("Adarsh");
            case 3 -> System.out.println("Abhishek");
            case 4 ->{
                System.out.println("EmpId is 3");
                String department = in.next();
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "CSE":
                        System.out.println("CSE department");
                        break;
                    case "management":
                        System.out.println("management department");
                        break;
                
                    default:
                        System.out.println("No department");
                }
            }
            default -> System.out.println("Enter correct EmpId");
            
        }
    }
}
