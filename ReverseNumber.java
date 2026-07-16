import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        int n,dig,rev = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number to be reversed");
        n = obj.nextInt();
        while(n!=0){
            dig = n%10;
            rev = rev*10 + dig;
            n = n/10;
        }
        System.out.print("Reverse: "+rev);
        obj.close();
    }


    
}
