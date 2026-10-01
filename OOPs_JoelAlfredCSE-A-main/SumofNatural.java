import java.util.*;
public class SumofNatural{
    public static void main(String[] args){
          int sum = 0,n,i;
          Scanner obj = new Scanner(System.in);
          System.out.print("Enter a number: ");
          n = obj.nextInt();
          for(i=1;i<=n;i++){
            sum += i;
          }
        System.out.print("Sum: " + sum);
        obj.close();

    }
}