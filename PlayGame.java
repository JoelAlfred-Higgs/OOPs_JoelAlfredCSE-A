import java.util.Scanner;
import game.NumberGuess;

public class PlayGame{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int guess;
            System.out.print("Guess a number from 1 - 10: ");
            guess = sc.nextInt();
            NumberGuess obj = new NumberGuess();
            if(obj.guessnum(guess))
                 System.out.print("You guessed it right!!!");
            else{
                System.out.print("Wrong number Try Again !!!");
            }
    }
}