import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char alpha = obj.next().charAt(0);
        if((alpha >= 65 && alpha <= 90) || (alpha >= 97 && alpha <= 122))
            System.out.print("Its an alphabet");
        else
            System.err.print("Its not an alphabet");
        obj.close();
}


}
