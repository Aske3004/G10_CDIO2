public class Player {
    String playerName;
    Balance playerBalance;

    public Player(String pName){
        this.playerName = pName;
        playerBalance = new Balance();
    }
}