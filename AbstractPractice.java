import java.util.Scanner;
abstract class Shape{
    abstract void printArea();
    int dim1,dim2; 
    /*for rectangle - dim1 is length and dim2 is breadth
      for circle - dim1 is radius
      for traingle - dim1 is base and dim2 is height */
}

class Rectangle extends Shape{
    @Override // overrides the printArea Method 
    void printArea(){
        System.out.println("Area of Rectangle: "+(dim1*dim2));
    }
}

class Circle extends Shape{
    @Override 
    void printArea(){
        System.out.println("Area of Circle: "+(3.14*dim1*dim1));
    }
}

class Triangle extends Shape{
    @Override
    void printArea(){
        System.out.println("Area of Triangle: "+(0.5*dim1*dim2));
    }
}

public class AbstractPractice{
    public static void main(String[] args)
    {
        int ch;
        Scanner obj = new Scanner(System.in);
        Shape area = null;
        System.out.print("Enter shape choice(1-Rectangle,2-circle,3-triangle: ");
        ch = obj.nextInt();
        switch(ch){
            case 1:
                area = new Rectangle();
                System.out.print("Enter Length and breadth: ");
                area.dim1 = obj.nextInt();
                area.dim2 = obj.nextInt();
                area.printArea();
                break;
            case 2:
                area = new Circle();
                System.out.print("Enter Radius: ");
                area.dim1 = obj.nextInt();
                area.printArea();
                break;
            case 3:
                area = new Triangle();
                System.out.print("Enter Base and Height: ");
                area.dim1 = obj.nextInt();
                area.dim2 = obj.nextInt();
                area.printArea();
                break;
            default:
                System.out.println("Invalid shape!");
        }
     obj.close();
    }

}