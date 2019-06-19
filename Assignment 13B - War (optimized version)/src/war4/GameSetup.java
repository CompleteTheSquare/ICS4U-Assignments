package war4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;

public class GameSetup extends Gui {

      /**
     * @param 
     */
    public static void initialize() {

        //puts these initial values into an array
        Collections.addAll(computerRanksAL, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13");
        Collections.addAll(computerSuitsAL, "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S");
        Collections.addAll(playerRanksAL, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13");
        Collections.addAll(playerSuitsAL, "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H");

      
        
    }
    /**
     * @param 
     */
    public static void shuffleDeck(){//takes 1 card from the player and 1 card from the computer's hand. 
        //stores their values and suits in an array
                for (int i = 0; i < 100; i++) {
            ArrayList<String> tempSuit = new ArrayList<String>();
            ArrayList<String> tempRank = new ArrayList<String>();;
            int randPlayer = randPlayerCard();
            int randComputer = randComputerCard();

            //switch both the cards
            Collections.addAll(tempRank, computerRanksAL.get(randComputer));
            computerRanksAL.set(randComputer, playerRanksAL.get(randPlayer));
            playerRanksAL.set(randPlayer, tempRank.get(0));

            Collections.addAll(tempSuit, computerSuitsAL.get(randComputer));
            computerSuitsAL.set(randComputer, playerSuitsAL.get(randPlayer));
            playerSuitsAL.set(randPlayer, tempSuit.get(0));

        }
    }
    
        /**
     * @param 
     */
    private static int randPlayerCard() {
        Random random = new Random();
        int number = random.nextInt(playerRanksAL.size());
        return number;
    }
    /**
     * @param 
     */
        private static int randComputerCard() {
        Random random = new Random();
        int number = random.nextInt(computerRanksAL.size());
        return number;
    }

    
}
