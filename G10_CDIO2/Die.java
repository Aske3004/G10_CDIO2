import java.util.Random;

public class Die {
    public int dieValue;
    String dieName = "";
    Random random = new Random();

    public Die(String dName){
        dieName = dName;
    }

    public void rollDie(){
        dieValue = random.nextInt(6) + 1;
    }
}