public class Balance {
    private int balance;

    public Balance(){
        this.balance = 1000;
    }

    public Boolean addToBalance(int amount){
        if (amount >= 0){
            balance += amount;
            return true;
        } else {
            System.out.println("Error! Amount can not be negative.");
            return false;
        }
    }

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

    public int getBalance(){
        return balance;
    }
}
