import java.util.*;
public class SwapNumbers {
    public static void main(){
       int a,b,temp;
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter three numbers: ");
       a = obj.nextInt();
       b = obj.nextInt();
       System.out.println("Numbers before swapping: " + a + b );
       temp = a;
       a = b;
       b = temp;
       System.out.print("Numbers After swapping: "+a+b);
       obj.close();
    }
}
