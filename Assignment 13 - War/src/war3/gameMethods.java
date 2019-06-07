/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Sterling
 */
public class gameMethods extends gui {

    //pick random card from either player's hand and store the random card's values and suits into an array
    //whoever has a higher rank (string) will win
    public static void checkValues() {

        ArrayList<String> compSuitHolder = new ArrayList<String>();
        ArrayList<String> compRankHolder = new ArrayList<String>();
        ArrayList<String> playerSuitHolder = new ArrayList<String>();
        ArrayList<String> playerRankHolder = new ArrayList<String>();

        int playerLast = playerRanksAL.size() - 1;
        int computerLast = computerRanksAL.size() - 1;
        System.out.println("playerLast: " + playerLast);
        System.out.println("computerLast: " + computerLast);
        Collections.addAll(compRankHolder, computerRanksAL.get(computerLast));
        Collections.addAll(compSuitHolder, computerSuitsAL.get(computerLast));
        Collections.addAll(playerRankHolder, playerRanksAL.get(playerLast));
        Collections.addAll(playerSuitHolder, playerSuitsAL.get(playerLast));
        System.out.println("");
        System.out.println("random card chosen from player hand is:  " + playerRankHolder + "          " + playerSuitHolder);
        System.out.println("random card chosen from comp hand is:  " + compRankHolder + "          " + compSuitHolder);
        System.out.println("");
        String playerStringHolder = playerRankHolder.get(0);
        String compStringHolder = compRankHolder.get(0);

        int playerIntHolder = Integer.parseInt(playerStringHolder);

        int compIntHolder = Integer.parseInt(compStringHolder);

        
        
        
        if (playerIntHolder > compIntHolder) {
            System.out.println("");
            System.out.println("cards will now go to player");
            System.out.println("PlayerArrayList Suit previous: " + playerSuitsAL);
            System.out.println("PlayerArrayList Ranks previous: " + playerRanksAL);
            Collections.addAll(playerSuitsAL, playerSuitHolder.get(0));
            Collections.addAll(playerRanksAL, playerRankHolder.get(0));
            computerRanksAL.remove (compRankHolder);

            computerSuitsAL.remove (compSuitHolder);
            playerRanksAL.remove(playerLast);
            System.out.println("PlayerArrayList Suit now: " + playerSuitsAL);
            System.out.println("PlayerArrayList Ranks now: " + playerRanksAL);
            System.out.println("");
        } else if (playerIntHolder < compIntHolder) {
            System.out.println("");
            System.out.println("cards will now go to computer");
            System.out.println("ComputerArrayList Suit previous: " + computerSuitsAL);
            System.out.println("ComputerArrayList Ranks previous: " + computerRanksAL);
            Collections.addAll(computerSuitsAL, compSuitHolder.get(0));
            Collections.addAll(computerRanksAL, compRankHolder.get(0));
            //playerRankHolder.remove(playerLast);
            //playerSuitHolder.remove(playerLast);
            System.out.println("");
            System.out.println("ComputerArrayList Suit now: " + computerSuitsAL);
            System.out.println("ComputerArrayList Ranks now: " + computerRanksAL);
            System.out.println("");
        } else if (playerIntHolder == compIntHolder) {
            War(computerRanksAL, playerRanksAL, computerSuitsAL, playerSuitsAL);
            System.out.println("");
            System.out.println("wartyme");
            System.out.println("");
        }

    }

    private static void War(ArrayList<String> computerRanksAL, ArrayList<String> playerRanksAL, ArrayList<String> computerSuitAL, ArrayList<String> playerSuitAL) {

        System.out.println("cats");
        System.out.println("computer ranks: " + computerRanksAL);
        System.out.println("computer Suits: " + computerSuitAL);
        System.out.println("player ranks: " + playerRanksAL);
        System.out.println("player suits: " + playerSuitAL);
    }

}
