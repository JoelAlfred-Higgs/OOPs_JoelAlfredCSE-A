import java.util.*;
public class QuadraticRoot {
    public static void main(String[] args) {
        float a,b,c,d;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the coefficents of the quadratic equation: ");
        a = obj.nextFloat();
        b = obj.nextFloat();
        c = obj.nextFloat();
        d = b*b - 4*a*c;
        if(d>0){
            float root1 = (-b + d)/(2*a);
            float root2 = (-b - d)/(2*a);
            System.out.println("Roots are real and different!");
            System.out.println("Root1: "+root1+" ,"+"Root2: "+root2);
        }
        else if(d==0){
            float root = -b/(2*a);
            System.out.println("Roots are real and equal!");
            System.out.println("Root: "+root);
        }
        else{
            double real = -b/(2*a);
            double imag = Math.sqrt(-d) /(2*a);
            System.out.println("Roots are complex and different1");
            System.out.println("Real root: "+real + " + " + imag+"i");
            System.out.println("Real root: "+real + " - " + imag+"i");
        }
     obj.close();

    } 
}
