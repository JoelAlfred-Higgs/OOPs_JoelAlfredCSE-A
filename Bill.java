import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        double bill,discount,ship,cost;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter cost of the product: ");
        cost = obj.nextFloat();
        if(cost>700){
            discount = cost*(0.25);
            ship = cost*(0.05) ;
            
        }else{
            discount = 0;
            ship = 0.05;
        }
        bill = (cost - discount) + ship;
        System.out.println("Total Bill: "+bill);
        obj.close();
    }
}
