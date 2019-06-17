/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;
import static war4.Gui.playerRanksAL;

/**
 *
 * @author Sterling
 */
public class Gameplay extends Gui {

    //pick random card from either player's hand and store the random card's values and suits into an array
    //whoever has a higher rank (string) will win
    protected static int compareValues() {

        int returnHolder = 0;//0 means player wins draw, 1 means computer wins draw, -1 means there is war 
        int playerLastCard = playerRanksAL.size() - 1;//the last card in player deck
        int computerLastCard = computerRanksAL.size() - 1;// the last card in the computer deck

        //holds the string retrieved from the array
        String pStringHolder = playerRanksAL.get(playerLastCard);
        String cStringHolder = computerRanksAL.get(computerLastCard);

        int playerIntHolder = Integer.parseInt(pStringHolder);
        int computerIntHolder = Integer.parseInt(cStringHolder);

        //if player card is bigger, add last card from their deck as the last card of the player deck.
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

    public static void war() {
        //player win
        if (Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)) > Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1))) {
            addPlayerClear();
            distribution = 0;
        } else if (Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)) < Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1))) {
            addCompClear();
            distribution = 1;
        } else if (Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)) == Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1))) {
            if (distribution == 0) {
                addPlayerClear();
            } else {
                addCompClear();
            }
        }

    }

    public static int playerComp() {
        Random random = new Random();
        int number = random.nextInt(2);
        return number;
    }

    private static void addCompClear() {
        computerRanksAL.addAll(RanksWarHolder);
        computerSuitsAL.addAll(SuitsWarHolder);
        RanksWarHolder.clear();
        SuitsWarHolder.clear();

    }

    private static void addPlayerClear() {
        playerRanksAL.addAll(RanksWarHolder);
        playerSuitsAL.addAll(SuitsWarHolder);
        RanksWarHolder.clear();
        SuitsWarHolder.clear();
    }

}
