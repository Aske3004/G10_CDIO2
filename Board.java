import java.util.HashMap;
public class Board{
    // creating a hashmap for the driffert values and a hashmap 
    //for the bankbalance opdates corresponding to the different values.
    public static boardBalanceUpdate(player, theDiceroll){
        HashMap<Integer,Integer> boardbalance = new HashMap<>();
            boardbalance.put(2 , 250);
            boardbalance.put(3 , -100);
            boardbalance.put(4 , 100);
            boardbalance.put(5 , -20);
            boardbalance.put(6 , 180);
            boardbalance.put(7 , 0);
            boardbalance.put(8 , -70);
            boardbalance.put(9 , 60);
            boardbalance.put(10 , -80);
            boardbalance.put(11 , -50);
            boardbalance.put(12 , 650);
        //updating players balance and returns it 
        player.blance += boardbalance.get(theDieRoll);
        return player.blance;

    }
    public static fieldstory(theDiceroll){
        HashMap<Integer,String> fieldstorys = new HashMap<>();
        boardbalance.put(2 , "You climbed the Tower and found a treasure at the top. You gain 250 gold coins!");
        boardbalance.put(3 , "You stumbled into a deep Crater and struggled to get out. You lose 100 gold coins.");
        boardbalance.put(4 , "At the Palace Gates, you’re rewarded by the guards with 100 gold coins for your bravery.");
        boardbalance.put(5 , "Crossing the Cold Desert drained your resources. You lose 20 gold coins.");
        boardbalance.put(6 ,  "You enter the Walled City and are hired as a guard, earning 180 gold coins.");
        boardbalance.put(7 , "You rest peacefully at the Monastery, but gain nothing.");
        boardbalance.put(8 , "In the Black Cave, shadows steal some of your belongings. You lose 70 gold coins.");
        boardbalance.put(9 , "You discover a friendly village with Huts in the Mountain and earn 60 gold coins selling goods.");
        boardbalance.put(10 , "The Werewall appears! You lose 80 gold coins but gain an extra turn as the werewolf howls.");
        boardbalance.put(11 , -"You fell into a deep pit and need help to get up, you paid 50 ");
        boardbalance.put(12 , "You found gold in the mauntian and sold it for 650 gold coins!!.... damm you rich");
        return fieldstory.get(theDiceroll);
    }
}