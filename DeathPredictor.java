import java.util.Scanner;
public class DeathPredictor{
    public static void main(String[] args ){
         Predictor obj = new Predictor();
         obj.getUserDetails();
         obj.lifestyle_details();
         obj.scoreCalculator();
         obj.message_user();
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
    if(BMI >= 18.5 && BMI <= 24.9) // calculates BMI
        score += 10;
    else
        score -= 10;
    if(smoker.equalsIgnoreCase("yes"))//checks if user smokes
        score -= 20;
    if(alcohol.equalsIgnoreCase("yes"))// checks if user consumes alcohol
        score -= 10;
    if(sleep_hours >= 7 && sleep_hours <= 8) // average sleeping hrs 
        score += 10;
    else if(sleep_hours >= 5)
        score -= 5;
    else
        score -= 10;
    if(exercise >= 1)// hrs of exercise
        score += 10;
    else if(exercise > 0)
        score += 5;
    else
        score -= 10;
    if(fastfood_freq <= 4) // how many times does user consumes juck food in a week
        score += 5;
    else if(fastfood_freq <= 8)
        score -= 5;
    else
        score -= 10;
    switch(stress_level) {// score is updated based on stress level
        case 1:
            score += 10;
            break;
        case 2:
            break;
        case 3:
            score -= 15;
            break;
    }
    if(score > 100)// if user gets a score above 100, the score is set to 100
        score = 100;
    if(score < 0)
        score = 0; }

void message_user(){
    System.out.println("\n========== RESULT ==========");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Health Score: " + score + "/100");

    if(score >= 90) {
        remaining_years = 85 - age;
        System.out.print("You got " + remaining_years +" years. Well thats a long period of time make sure you cherish every moment!!!");
    }
    else if(score >= 75) {
        remaining_years = 80 - age;
        System.out.print("You got " + remaining_years +" years. Thats a good amount of life so live happily and peacefully!!!");
    }
    else if(score >= 60) {
        remaining_years = 75 - age;
        System.out.print("You got " + remaining_years +" years. Not bad but still you can grind and increase your health!!!");
    }
    else if(score >= 40) {
        remaining_years = 70 - age;
        System.out.print("You got " + remaining_years +" years. Thats still a lot of time, but you can definitely improve your lifestyle!!!");
    }
    else {
        remaining_years = 60 - age;
        System.out.print("You got " + remaining_years +" years, You got to clutch on pal or else the reaper will take you its home!!!");
    }
}
}
    