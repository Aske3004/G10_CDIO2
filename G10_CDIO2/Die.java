import java.util.Random;

public class Die {
    public int dieValue;
    String dieName = "";
    Random random = new Random();
    int highestRoll;

    public Die(String dName, int theHighest){
        dieName = dName;
        highestRoll=theHighest;
    }

    public void rollDie(){
        dieValue = random.nextInt(highestRoll) + 1;
    }
}