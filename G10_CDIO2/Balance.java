public class Balance {
    private String playerName;
    private int balance;

    public Balance(String playerName){
        this.playerName = playerName;
        this.balance = 1000;
    }

    public int addToBalance(int amount){
        balance += amount;
        return balance;
    }

    public int withdrawFromBalance(int amount){
        balance -= amount;
        return balance;
    }

    public int getBalance(){
        return balance;
    }
}
