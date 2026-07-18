import java.util.Scanner;

public class CountDigits {
    public static void main(String [] args){
       int num,count = 0,dig;
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter a Number: ");
       num = obj.nextInt();
       while(num!=0){
        dig = num%10;
        count++;
        num = num/10;
       }
        System.out.print("Count = "+count);
        obj.close();
        
    }
}
