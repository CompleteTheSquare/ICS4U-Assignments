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

        //if player card is bigger, add last card from their deck as the last card of the player deck.
        if (playerIntHolder > computerIntHolder) {
            System.out.println("Player card is bigger");
            Collections.addAll(playerRanksAL, computerRanksAL.get(computerLastCard));
            Collections.addAll(playerSuitsAL, computerSuitsAL.get(computerLastCard));
            computerRanksAL.remove(computerLastCard);
            computerSuitsAL.remove(computerLastCard);
            GameSetup.shuffleDeck();

        } else if (playerIntHolder < computerIntHolder) {
            System.out.println("Computer card is bigger");
            Collections.addAll(computerRanksAL, playerRanksAL.get(playerLastCard));
            Collections.addAll(computerSuitsAL, playerSuitsAL.get(playerLastCard));
            playerRanksAL.remove(playerLastCard);
            playerSuitsAL.remove(playerLastCard);
            GameSetup.shuffleDeck();
        } else if (playerIntHolder == computerIntHolder) {

            playerRanksAL.remove(playerLastCard);
            playerSuitsAL.remove(playerLastCard);
            computerRanksAL.remove(computerLastCard);
            computerSuitsAL.remove(computerLastCard);

            System.out.println("war");
            disableDraw0 = 1;

        }

    }

    public static void war() {
        //player win
        if (Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)) > Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1))) {
            System.out.println("player win");
            System.out.println("player put down: " + Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)));
            System.out.println("computer put down: " + Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1)));
            playerRanksAL.addAll(RanksWarHolder);
            playerSuitsAL.addAll(SuitsWarHolder);
            RanksWarHolder.clear();
            SuitsWarHolder.clear();

        }
        if (Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)) < Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1))) {
            System.out.println("computer win");
            System.out.println("player put down: " + Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)));
            System.out.println("computer put down: " + Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1)));
            computerRanksAL.addAll(RanksWarHolder);
            computerSuitsAL.addAll(SuitsWarHolder);
            RanksWarHolder.clear();
            SuitsWarHolder.clear();
        }
        if (Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)) == Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1))) {
            System.out.println("wtf a war tie");
            System.out.println("player put down: " + Integer.parseInt(playerRanksAL.get(playerRanksAL.size() - 1)));
            System.out.println("computer put down: " + Integer.parseInt(computerRanksAL.get(computerRanksAL.size() - 1)));
        }

    }

    public static boolean check1Computer() {
        boolean Is1 = false;
        if (computerRanksAL.size() == 1) {
            System.out.println("player wins");
            Is1 = true;//returns true if value is 1, game unable to progress
        }
        return Is1;
    }

    public static boolean check1Player() {
        boolean Is1 = false;
        if (playerRanksAL.size() == 1) {
            System.out.println("computer wins");
            Is1 = true;//returns true if value is 1, game unable to progress
        }
        return Is1;
    }

    public static boolean check0Player() {

        boolean Is0 = false;
        if (playerRanksAL.size() == 0) {
            System.out.println("computer wins");
            Is0 = true;
        }

        return Is0;
    }

    public static boolean check0Computer() {

        boolean Is0 = false;
        if (computerRanksAL.size() == 0) {
            System.out.println("player wins");
            Is0 = true;
        }

        return Is0;
    }
}
