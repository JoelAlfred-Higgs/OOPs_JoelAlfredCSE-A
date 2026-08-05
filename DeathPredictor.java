import java.util.Scanner;
public class DeathPredictor{
    public static void main(String[] args ){
         LifeStyle obj = new LifeStyle();
         obj.lifestyle_details();
    }
}
class Person{
    String name;
    int age;
    double height,weight;
    Person(){
        System.out.print("========Welcome to Death predictor========\nHere you can determine how long you got to live\nbased on the details about lifestyle and habits\nImportant Notice:\nThis is for Educational Purpose Only!\nPlease Enter some Details about you!!!");
    }
    public void getUserDetails(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter height(cm) and weight(kg): ");
        weight = input.nextDouble();
        height = input.nextDouble();
    }
}
class LifeStyle extends Person{
    String alcohol,smoker;
    int sleep_hours,fastfood_freq,stress_level,exercise;
    Scanner input = new Scanner(System.in);
    LifeStyle(){
        System.out.print("Now Enter some details about your Lifestyle and Habits!!!");
        super();
    }
    public void lifestyle_details(){
        System.out.print("On an Average How long do you sleep(hrs) in a day: ");
        sleep_hours = input.nextInt();
        System.out.print("How long do you perform exercise(if yes enter in hrs else 0): ");
        exercise = input.nextInt();
        System.out.print("How many times you consume fastfood in a month: ");
        fastfood_freq = input.nextInt();
        System.out.print("Do you consume alcohol(yes/no): ");
        alcohol = input.next();
        System.out.print("Do you smoke(yes/no): ");
        smoker = input.next();
        System.out.print("Enter your stress Level: ");
        stress_level = input.nextInt();
    }
    
}