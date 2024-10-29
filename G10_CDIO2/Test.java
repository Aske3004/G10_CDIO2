/*The program is used to test the board game developed, 
ensuring that the balance cannot reach a negative value.*/
class Test {
    public static void main(String[] args){
        Player player = new Player();

        System.out.println("The player starting balance is: " + player.playerBalance.getBalance() + "\n");

        //Balance Test
        for (int i = 0; i < 4; i++) {
            //Decreseas the player balance by -500 coins an iteration
            System.out.println("Decresing by 500 coins...");
            player.playerBalance.withdrawFromBalance(500);

            System.out.println("The player balance is now: " + player.playerBalance.getBalance());
            System.out.println("");
        }

        
    }
}