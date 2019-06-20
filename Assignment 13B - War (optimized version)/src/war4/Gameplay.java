package war4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;
import static war4.Gui.playerRanksAL;

public class Gameplay extends Gui {

    /**
     * This method compares 2 cards, 1 from each of the top of the player hands.
     * Whoever has the highest card gets the 2 cards and the deck is
     * re-shuffled.
     */
    public static int compareValues() {
        int returnHolder = 0;// this integer holds a value: 0 means player wins draw, 1 means computer wins draw, -1 means there is war 
        int playerLastCard = playerRanksAL.size() - 1;//the last card in player deck
        int computerLastCard = computerRanksAL.size() - 1;// the last card in the computer deck

        //holds the string retrieved from the array
        String pStringHolder = playerRanksAL.get(playerLastCard);//retrieves the suit of the player's card
        String cStringHolder = computerRanksAL.get(computerLastCard);//retrieves the suit of the computer's card

        //in order to compare which card is higher, both of the cards must be a numerical value
        int playerIntHolder = Integer.parseInt(pStringHolder);
        int computerIntHolder = Integer.parseInt(cStringHolder);

        //if player card is bigger, add last card from their deck as the last card of the player deck, then shuffle deck. Return 0. 
        //if computer card is bigger, add last card their deck as the last card of the computer deck, then shuffle deck. Return 1.
        //if there is a tie, disable the draw button. Return -1.
        if (playerIntHolder > computerIntHolder) {
            Collections.addAll(playerRanksAL, computerRanksAL.get(computerLastCard));
            Collections.addAll(playerSuitsAL, computerSuitsAL.get(computerLastCard));
            computerRanksAL.remove(computerLastCard);
            computerSuitsAL.remove(computerLastCard);
            GameSetup.shuffleDeck();
            returnHolder = 0;//if player card
        } else if (playerIntHolder < computerIntHolder) {
            Collections.addAll(computerRanksAL, playerRanksAL.get(playerLastCard));
            Collections.addAll(computerSuitsAL, playerSuitsAL.get(playerLastCard));
            playerRanksAL.remove(playerLastCard);
            playerSuitsAL.remove(playerLastCard);
            GameSetup.shuffleDeck();
            returnHolder = 1;
        } else if (playerIntHolder == computerIntHolder) {
            disableDraw = 1;
            returnHolder = -1;
        }
        return returnHolder;
    }

    /**
     * This method compares 2 cards, 1 from each of the top of the player hands.
     * Whoever has the highest card gets the 2 cards and the deck is
     * re-shuffled.
     */
    public static void war() {
        //if player's last card is highest, all cards go to the player
        if (Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)) > Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1))) {
            addPlayerClear();
            distribution = 0;//need these to set message for display panel
            //if computer's card is highest, all cards go to the computer
        } else if (Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)) < Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1))) {
            addComputerClear();
            distribution = 1;//need this to set message for display panel
        } else if (Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)) == Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1))) {
            if (distribution == 0) { //in a war, the distribution variable holds a randomly generated number, either 0 (player gets all cards) or 1 (computer gets all cards)
                addPlayerClear(); //give cards to the player and clear the holding array
            } else {
                addComputerClear(); //give cards to the computer and clear the holding array
            }
        }

    }

    /**
     * This method randomly select a number (0 or 1)
     */
    public static int playerComp() {
        Random random = new Random();
        int number = random.nextInt(2);
        return number;
    }

    /**
     * This method adds the cards on the field in a war to the computer's hand
     * (cards get to the hand, and are removed from the field)
     */
    private static void addComputerClear() {
        computerRanksAL.addAll(RanksWarHolder);
        computerSuitsAL.addAll(SuitsWarHolder);
        RanksWarHolder.clear();
        SuitsWarHolder.clear();

    }

    /**
     * This method adds the cards on the field in a war to the player's hand
     * (cards get to the hand, and are removed from the field)
     */
    private static void addPlayerClear() {
        playerRanksAL.addAll(RanksWarHolder);
        playerSuitsAL.addAll(SuitsWarHolder);
        RanksWarHolder.clear();
        SuitsWarHolder.clear();
    }

    

}
