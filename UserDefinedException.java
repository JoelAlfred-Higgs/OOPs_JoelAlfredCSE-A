import java.util.Scanner;
class EmailAlreadyRegisteredException extends Exception{
    void errorMessage(){
        System.out.print("Email already exist ,Try using different email...");

    }
    
}

public class UserDefinedException{
    public static void main(String []args ){
        String email[] = {"higgs@abc.com","bruce@abc.com","patrick@abc.com"};
        String new_email = "";
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Email Address: ");
            new_email = sc.nextLine();
        }
        try {
            for (String mail : email) {
                if (new_email.equalsIgnoreCase(mail)) {
                    throw new EmailAlreadyRegisteredException();//throws an object of that exception
                }
            }
            System.out.print("Email registered successfully");
        } 
        catch (EmailAlreadyRegisteredException e) {
            e.errorMessage();
        }

    }
}