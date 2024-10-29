public class Balance {
    private String playerName;
    private int balance;

    public Balance(String playerName){
        this.playerName = playerName;
        this.balance = 1000;
    }

    public int addToBalance(int amount){
        if (amount > 0){
            balance += amount;
            return balance;
        } else {
            System.out.println("Error! Amount can not be negative.")
            return balance;
        }
    }

    public int withdrawFromBalance(int amount){
        if (amount > 0){
            if (balance - amount >= 0){
                balance -= amount;
                return balance;
            } else {
                System.out.println("Error! Not enough money in account.");
                return balance;
            }
        } else {
            System.out.println("Error! Amount can not be negative.")
            return balance;
        }
    }

    public int getBalance(){
        return balance;
    }
}
