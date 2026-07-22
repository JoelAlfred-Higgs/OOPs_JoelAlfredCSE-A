import java.util.*;
class Strong{
     public static void main(String[] args){
        int n,i,res=0,dig,fact = 1,temp;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = obj.nextInt();temp = n;
        while(temp!=0){
            fact = 1;
            dig  = temp%10;
            for(i=1;i<=dig;i++)
                fact*=i;
            res += fact;
            temp = temp/10;
        }   
        if(res==n)
            System.out.print("Its a Strong number!");
        else
            System.out.print("Not a Strong number!");
        obj.close();
    }
}