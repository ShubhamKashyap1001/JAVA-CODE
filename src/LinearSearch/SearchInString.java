

// public class SearchInString {
//     public static void main(String[] args) {
//         String name = "shubham";
//         char target = 'u';
//         System.out.println(linearSearch(name,target));
//     }    

//     static boolean linearSearch(String str,char target){
//         if(str.length() == 0){
//             return false;
//         }

//         for(int i = 0;i< str.length();i++){
//             if(str.charAt(i) == target){
//                 return true;
//             }
//         }
//         return false;
//     }
// }
import java.util.Arrays;

import java.util.Scanner;
public class SearchInString{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target char:");
        char target  = in.next().charAt(0);
        in.nextLine();
        System.out.println("Enter the string:");
        String input = in.nextLine();
        System.out.println(linearSearch(input,target));
    }
    static boolean linearSearch(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}