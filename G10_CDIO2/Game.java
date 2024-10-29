public class Game {
    public static void main(String[] args){
        String playerTurn = "Player1";
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        int theRoll = 0;

        Board theBoard = new Board();

        Player player1 = new Player();
        Player player2 = new Player();

        Die die1 = new Die(6);
        Die die2 = new Die(6);

        Boolean player1Won = false;
        Boolean player2Won = false;

        //Make the game continue until a player has met the winning criterias and therefore wins the game.
        while (!player1Won && !player2Won){
            System.out.println("The scoreboard is currently:");
            System.out.println("Player1 has " + player1.playerBalance.getBalance() + " gold coins.");
            System.out.println("Player2 has " + player2.playerBalance.getBalance() + " gold coins.");
            System.out.println("Press Enter to continue with " + playerTurn + "'s turn");

            //Here we make the program run the next time the Enter butten has been pressed, and then depending on
            //whether its player1's or player2's turn do 2 different things.
            try{scanner.nextLine();}
            catch(Exception e){}  
                if(playerTurn.equals("Player1")){
                    theRoll = (die1.rollDie() + die2.rollDie());
                    theBoard.boardBalanceUpdate(player1,theRoll);
                    System.out.println(theBoard.fieldstory(theRoll));
                    System.out.println(" ");
                    
                    if((theRoll == 10)){
                        playerTurn = "Player1";
                    } else{
                        playerTurn = "Player2";
                    } 
                }
                else if(playerTurn.equals("Player2")){
                    theRoll = (die1.rollDie() + die2.rollDie());
                    theBoard.boardBalanceUpdate(player2,theRoll);
                    System.out.println(theBoard.fieldstory(theRoll));
                    System.out.println(" ");
                    
                    if((theRoll == 10)){
                        playerTurn = "Player2";
                    } else{
                        playerTurn = "Player1";
                    } 
                }
                if(player1.playerBalance.getBalance() >= 3000){
                    player1Won = true;
                } else if(player2.playerBalance.getBalance() >= 3000){
                    player2Won=true;
                }
            }

            //When the winning criterias has been met we break out of the loop and run these next lines to display the winner
            //of the game.
            if(player1Won){
                System.out.println("Player1 has reached " + player1.playerBalance.getBalance() + " gold coins, and has therefore won the game!");
            } 
            else if(player2Won){
                System.out.println("Player2 has reached " + player2.playerBalance.getBalance() + " gold coins, and has therefore won the game!");
            }
        scanner.close();
    }
}
