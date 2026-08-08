import java.util.Scanner;
public class DeathPredictor{
    public static void main(String[] args ){
         Predictor obj = new Predictor();
         obj.getUserDetails();
         obj.lifestyle_details();
         obj.scoreCalculator();
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
class Predictor extends LifeStyle{
    double BMI;
    int score = 50,estimated_age,remaining_years;
    public void scoreCalculator() {
    double heightMeter = height / 100.0;
    BMI = weight / (heightMeter * heightMeter);
    if(BMI >= 18.5 && BMI <= 24.9)
        score += 10;
    else
        score -= 10;
    if(smoker.equalsIgnoreCase("yes"))
        score -= 20;
    if(alcohol.equalsIgnoreCase("yes"))
        score -= 10;
    if(sleep_hours >= 7 && sleep_hours <= 8)
        score += 10;
    else if(sleep_hours >= 5)
        score -= 5;
    else
        score -= 10;
    if(exercise >= 1)
        score += 10;
    else if(exercise > 0)
        score += 5;
    else
        score -= 10;
    if(fastfood_freq <= 4)
        score += 5;
    else if(fastfood_freq <= 8)
        score -= 5;
    else
        score -= 10;
    switch(stress_level) {
        case 1:
            score += 10;
            break;
        case 2:
            break;
        case 3:
            score -= 15;
            break;
    }
    if(score > 100)
        score = 100;
    if(score < 0)
        score = 0;
    System.out.println("\n========== RESULT ==========");
    System.out.println("Name: " + name);
    System.out.println("Age: "+age);
if(score >= 90)
    estimated_age = 80;
else if(score >= 75)
    estimated_age =  75;  
else if(score >= 60)
    estimated_age = 65;
else if(score >= 40)
    estimated_age = 60;
else
    estimated_age = 50;

remaining_years = estimated_age - age;
System.out.print("You\'re current age is 19 and You got "+remaining_years+" years to live!!");

    }

}