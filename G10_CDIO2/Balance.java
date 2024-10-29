//this is our Balance class, which keeps track of the balance of the player and has the functions to addToBalance, withdrawFromBalance
//and getBalance of the player.

public class Balance {
    private int balance;


    //every player should start with 1000 gold
    public Balance(){
        this.balance = 1000;
    }

    //we add to the balance unless the amount is negative
    public Boolean addToBalance(int amount){
        if (amount >= 0){
            balance += amount;
            return true;
        } else {
            System.out.println("Error! Amount can not be negative.");
            return false;
        }
    }

    //we withdraw from the balance, unless the amount is negative.
    //also if the withdrawel amount exceeds the amount in the balance, it just gets set to 0.
    public Boolean withdrawFromBalance(int amount){
        if (amount >= 0){
            if (balance - amount >= 0){
                balance -= amount;
                return true;
            } else {
                balance = 0;
                return true;
            }
        } else {
            System.out.println("Error! Amount can not be negative.");
            return false;
        }
    }

    //get the balance
    public int getBalance(){
        return balance;
    }
}
