import java.util.Scanner;
interface Shape{
     void printArea();
}

class Rectangle implements  Shape{
    int dim1,dim2;

    Rectangle(int dim1,int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    public void printArea(){
        System.out.println("Area of Rectangle: "+(dim1*dim2));
    }
}

class Circle implements  Shape{
    int dim1;

    Circle(int dim1) {
            this.dim1 = dim1;
    }
    
    public void printArea(){
        System.out.println("Area of Circle: "+(3.14*dim1*dim1));
    }
}

class Triangle implements  Shape{
    int dim1,dim2;
    Triangle(int dim1,int dim2) {
       this.dim1 = dim1;
       this.dim2 = dim2;
    }
    
    public void printArea(){
        System.out.println("Area of Triangle: "+(0.5*dim1*dim2));
    }
}

public class InterfacePractice{
    public static void main(String[] args)
    {
        int ch;
        Scanner obj = new Scanner(System.in);
        Shape area = null;
        System.out.print("Enter shape choice(1-Rectangle,2-circle,3-triangle: ");
        ch = obj.nextInt();
        switch(ch){
            case 1:  
                System.out.print("Enter Length and breadth: ");
                int l = obj.nextInt();
                int b = obj.nextInt();
                area = new Rectangle(l,b);
                area.printArea();
                break;
            case 2:
                System.out.print("Enter Radius: ");
                int radius= obj.nextInt();
                area = new Circle(radius);
                area.printArea();
                break;
            case 3:
                System.out.print("Enter Base and Height: ");
                int base = obj.nextInt();
                int d = obj.nextInt();
                area = new Triangle(base,d);
                area.printArea();
                break;
            default:
                System.out.println("Invalid shape!");
        }
     obj.close();
    }

}