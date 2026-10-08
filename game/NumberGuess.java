
package game;

import java.util.Random;

public class NumberGuess{
    public boolean guessnum(int num){
        Random r = new Random();
        int random_num = r.nextInt(10) + 1;
        if(random_num == num){
            return true;
        }
        return false;
    }
}