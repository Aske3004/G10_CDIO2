//our Die class from the last game, with the dieValue being saved and the int highestroll being the highest value the die can be
//which means for this game we just set it to 6 so it functions like a normal 6 sided die.
import java.util.Random;

public class Die {
    private int dieValue;
    Random random = new Random();
    private int highestRoll;

    public Die(int theHighest){
        highestRoll=theHighest;
    }

    public int rollDie(){
        dieValue = random.nextInt(highestRoll) + 1;
        return dieValue;
    }
}