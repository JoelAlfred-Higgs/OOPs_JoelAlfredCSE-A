import java.util.Scanner;
public class GreatestNumber{
    public static void main(){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b&&a>c)
            System.out.println(a+" is the greatest number");
        else if(b>c)
            System.out.println(b+" is the greatest number");
        else
            System.out.println(c+" is the greatest number");
        sc.close();
    }
}