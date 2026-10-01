import java.util.Scanner;
abstract class Message{
    abstract void dispense(Snack<?,?> det);

}

class VendingMachine extends Message{
    @Override
    void dispense(Snack<?,?> det){ //accepts any type the user passes
        det.printDetails();
        System.out.print("\nHere you go!\nHave a Great day!!!!!");
    }

}

class Snack<T,U>{
    T name;
    U price;
    Snack(T name,U price){
        this.name = name;
        this.price = price;
    }

    void printDetails(){
        System.out.print("Item Name: "+name+" \nPrice: "+price);
        }

}

public class GenericClass{
    public static void main(String[] args){
        String name;
        Number price = 0;
        VendingMachine snack = new VendingMachine();// object creation for a generic class
        Scanner sc = new Scanner(System.in);
        System.out.print("What Do you want \n1.Soda - $50\n2.Chips - $30\n3.chocolate - $15\nWater - $5:\n");
        name = sc.nextLine();
        switch(name.toLowerCase().trim()){
            case "soda":
                price  = 50;
                break;
            case "chips":
                price = 30;
                break;
            case "chocolate":
                price  = 15;
                break;
            case "water":
                price  = 5;
            default:
                System.out.print("Not available!!!");
                sc.close();
                return;
        }
        Snack<String,Number> food = new Snack<>(name,price);
        snack.dispense(food);
        sc.close();


    }
}