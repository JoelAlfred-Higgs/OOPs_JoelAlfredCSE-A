import java.util.Scanner;
public class DeathPredictor{
    public static void main(String[] args ){
         LifeStyle obj = new LifeStyle();
         obj.getUserDetails();
         obj.lifestyle_details();
         
    }
}
class Person{
    String name;
    int age;
    double height,weight;
    Scanner input = new Scanner(System.in);
    Person(){
        System.out.print("========Welcome to Death predictor========\nHere you can determine how long you got to live\nbased on the details about lifestyle and habits\nImportant Notice:\nThis is for Educational Purpose Only!\nPlease Enter some Details about you!!!\n");
    }
    public void getUserDetails(){
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter weight(kg) and height(cm): ");
        weight = input.nextDouble();
        height = input.nextDouble();
    }
}
class LifeStyle extends Person{
    String alcohol,smoker;
    int sleep_hours,fastfood_freq,stress_level;
    double exercise;
    public void lifestyle_details(){
        System.out.println("=========================================================");
        System.out.println("Now Enter some details about your Lifestyle and Habits!!!");
        System.out.println("=========================================================");
        System.out.print("On an Average How long do you sleep(hrs) in a day: ");
        sleep_hours = input.nextInt();
        System.out.print("How long do you perform exercise(if yes enter in hrs else 0): ");
        exercise = input.nextDouble();
        System.out.print("How many times you consume fastfood in a month: ");
        fastfood_freq = input.nextInt();
        System.out.print("Do you consume alcohol(yes/no): ");
        alcohol = input.next();
        System.out.print("Do you smoke(yes/no): ");
        smoker = input.next();
        System.out.print("Enter your stress Level(low-1,medium-2,high-3): ");
        stress_level = input.nextInt();
    }
    
}