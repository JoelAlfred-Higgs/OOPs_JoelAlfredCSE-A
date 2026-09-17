import java.util.*;
public class StringMethods {

    static void stringMethod(String c_str){
        System.out.println("String Length: "+c_str.length());
        System.out.println("Concatenated: "+c_str.concat("new word"));
        System.out.println("Contains: "+c_str.contains("copy"));
        System.out.println("index of: "+c_str.indexOf("word"));
        System.out.println("trim: "+c_str.trim());
        System.out.println("equals: "+"hello".equalsIgnoreCase("hello"));
        System.out.println("Hashcode: "+c_str.hashCode());
        System.out.println("endswith: "+ "hello".endsWith("o"));
        System.out.println("compare to: "+ "Death".compareTo("aeatg"));
    }

    public static void main(String[] args) {
    String str = "";
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a string: ");
            str = sc.nextLine();
            stringMethod(str);
        }
       }
       

}

