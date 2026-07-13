import java.util.*;
public class Fibonacci {
    void main(){
    int i,n,a=0,b=1,c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    
    n = sc.nextInt();
    for(i=0;i<n;i++){
        System.out.print(a+" ");
        c = b+a;
        a= b;
        b = c;
    }
    sc.close();
}


}