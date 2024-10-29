//This is our main class which gives us the overall game functionality, and makes the different classes work together.
public class Game {
    public static void main(String[] args){
        //we initialise Player1 to have the first turn
        String playerTurn = "Player1";
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        int theRoll = 0;
        //Create our board
        Board theBoard = new Board();

        //Define the players
        Player player1 = new Player();
        Player player2 = new Player();

        //Define our 2 dice
        Die die1 = new Die(6);
        Die die2 = new Die(6);

        //The two booleans that make the game run unitl a player has won
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
                //if the current players turn is 'player1' it will run this
                if(playerTurn.equals("Player1")){
                    //We combine the values of the two die
                    theRoll = (die1.rollDie() + die2.rollDie());

                    //And update the players balance and display a message in the comsole according to the roll the player made
                    theBoard.boardBalanceUpdate(player1,theRoll);
                    System.out.println(theBoard.fieldstory(theRoll));
                    System.out.println(" ");
                    
                    //If the player rolls a 10 they get a second turn, otherwise swtich to player2
                    if((theRoll == 10)){
                        playerTurn = "Player1";
                    } else{
                        playerTurn = "Player2";
                    }
                }
                //And if the current player is player2 it will run this, and go through the same steps as with player1
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
                //At the end of every roll, we check if a player has gotten up to 3000 gold, and if they have we set their winning
                //condition to be true, and therefore we break out of the loop
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
