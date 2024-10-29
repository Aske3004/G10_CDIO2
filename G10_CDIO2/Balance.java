public class Balance {
    private String playerName;
    private int balance;

    public Balance(String playerName){
        this.playerName = playerName;
        this.balance = 1000;
    }

    public void addToBalance(int amount){
        if (amount > 0){
            balance += amount;
        } else {
            System.out.println("Error! Amount can not be negative.");
        }
    }

    public void withdrawFromBalance(int amount){
        if (amount > 0){
            if (balance - amount >= 0){
                balance -= amount;
            } else {
                System.out.println("Error! Not enough money in account.");
            }
        } else {
            System.out.println("Error! Amount can not be negative.");
        }
    }

    public int getBalance(){
        return balance;
    }
}
