import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionPgm{
    public static void main(String[] args) {
        int a,b,res;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        try {
            a = obj.nextInt(); // input exception
            b = obj.nextInt();
            res = a/b; // division by zero exception
            System.out.println("Result: "+res);
        } catch (ArithmeticException e) {
            System.out.println("Error message: "+e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Error message: Invalid input, input must be integer!");
        }
        finally{
            System.out.print("Program ended!");
           obj.close();
        }
        
    }
}