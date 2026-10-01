import java.util.*;
public class Vowels {
    public static void main(String[] args){
        char alpha,arr[] = {'A','a','E','e','I','i','O','o','U','u'};
        Scanner obj = new Scanner(System.in);
        int flag = 0;
        System.err.print("Enter a Character: ");
        alpha = obj.next().charAt(0);
        for(int i = 0;i<10;i++){
            if(arr[i]==alpha){
                System.out.print("Its a Vowel");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
        System.out.print("Its a consonant");
    }

        obj.close();
    }
    
}
