import java.util.Random;

public class Die {
    public int dieValue;
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