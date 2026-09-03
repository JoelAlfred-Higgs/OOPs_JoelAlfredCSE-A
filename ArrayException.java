import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException{
    public static void main(String[] args) {
        int arr[] = new int[5];
        int i,index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element: ");
        try{
        for(i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter index of element to  be accessed: ");
        index = sc.nextInt();
        System.out.print("Element at "+index+"is "+arr[index]);
       }
        catch(ArrayIndexOutOfBoundsException e){
              System.out.print("Error message: "+e.getMessage());
      }
        catch(InputMismatchException e){
            System.out.println("Error message: Invalid input,Please enter only integer"); // e.getmessage produces null for this exception
        }
       sc.close();
    }
}