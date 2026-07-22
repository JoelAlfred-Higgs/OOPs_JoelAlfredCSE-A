import java.util.Scanner;
class Multiplication{
    void main(String[] args){
        int i,n;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number for Multiplication:");
        n = obj.nextInt();
         System.out.println("Mulplication Table\n");
        for(i=1;i<=10;i++){
            int res = n*i;
            System.out.println(n + " * " + i + " = " + res);
            System.out.println();
        }
        obj.close();

    }
}