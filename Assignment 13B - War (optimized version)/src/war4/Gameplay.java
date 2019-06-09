/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war4;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;

/**
 *
 * @author Sterling
 */
public class Gameplay extends Gui {

    //pick random card from either player's hand and store the random card's values and suits into an array
    //whoever has a higher rank (string) will win
    protected static void compareValues() {

        int playerLastCard = playerRanksAL.size() - 1;//the last card in player deck
        int computerLastCard = computerRanksAL.size() - 1;// the last card in the computer deck

        //holds the string retrieved from the array
        String pStringHolder = playerRanksAL.get(playerLastCard);
        String cStringHolder = computerRanksAL.get(computerLastCard);

        int playerIntHolder = Integer.parseInt(pStringHolder);
        int computerIntHolder = Integer.parseInt(cStringHolder);
        System.out.println(playerRanksAL);
        System.out.println(playerSuitsAL);
        System.out.println("");
        System.out.println(computerRanksAL);
        System.out.println(computerSuitsAL);
        System.out.println("");
        System.out.println("last card from player hand is  " + playerRanksAL.get(playerLastCard) + "         " + playerSuitsAL.get(playerLastCard));
        System.out.println("last card from computer hand is  " + computerRanksAL.get(computerLastCard) + "         " + computerSuitsAL.get(computerLastCard));

        //if player card is bigger, add last card from their deck as the last card of the player deck then shuffle both computer and player hands.
        if (playerIntHolder > computerIntHolder) {
            System.out.println("Player card is bigger");
            Collections.addAll(playerRanksAL, computerRanksAL.get(computerLastCard));
            Collections.addAll(playerSuitsAL, computerSuitsAL.get(computerLastCard));
            computerRanksAL.remove(computerLastCard);
            computerSuitsAL.remove(computerLastCard);

        } else if (playerIntHolder < computerIntHolder) {
            System.out.println("Computer card is bigger");
            Collections.addAll(computerRanksAL, playerRanksAL.get(playerLastCard));
            Collections.addAll(computerSuitsAL, playerSuitsAL.get(playerLastCard));
            playerRanksAL.remove(playerLastCard);
            playerSuitsAL.remove(playerLastCard);
        } else if (playerIntHolder == computerIntHolder) {
            System.out.println("war");
        }
        GameSetup.shuffleDeck();
        Gui.printStuff();

    }

    int counter = 0;
    ArrayList<String> computerSuits2;
    ArrayList<String> computerRanks2;
    ArrayList<String> playerSuits2;
    ArrayList<String> playerRanks2;

    //first, we take the cards and put them down
    private static void war() {

    }

}
