import java.util.*;
public class LeapYear {
    public static void main(String [] args){
       int year;
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter Year:");
       year = obj.nextInt();
       if((year%4==0&&year%100!=0)||(year%400==0))
        System.out.print("Its a leapyear");
       else   
        System.out.print("Its not a leap year");
       obj.close();
    }
}
