/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Sterling
 */
public class gameMethods extends gui {

    //pick random card from either player's hand and store the random card's values and suits into an array
    //whoever has a higher rank (string) will win
    public static void checkValues(ArrayList<String> computerRanksAL, ArrayList<String> playerRanksAL, ArrayList<String> computerSuitAL, ArrayList<String> playerSuitAL) {

        System.out.println(computerRanksAL);
        System.out.println(playerRanksAL);
        System.out.println(computerSuitAL);
        System.out.println(playerSuitAL);

        ArrayList<String> compSuitHolder = new ArrayList<String>();
        ArrayList<String> compRankHolder = new ArrayList<String>();
        ArrayList<String> playerSuitHolder = new ArrayList<String>();
        ArrayList<String> playerRankHolder = new ArrayList<String>();

        int playerRandom = randomPlayerCard();
        int computerRandom = randomComputerCard();
        Collections.addAll(compRankHolder, computerRanksAL.get(computerRandom));
        Collections.addAll(compSuitHolder, computerSuitAL.get(computerRandom));
        Collections.addAll(playerRankHolder, playerRanksAL.get(playerRandom));
        Collections.addAll(playerSuitHolder, playerSuitAL.get(playerRandom));

        System.out.println("random card chosen from player hand is:  " + playerRankHolder + "          " + playerSuitHolder);
        System.out.println("random card chosen from comp hand is:  " + compRankHolder + "          " + compSuitHolder);

        String playerStringHolder = playerRankHolder.get(0);
        String compStringHolder = compRankHolder.get(0);

        int playerIntHolder = Integer.parseInt(playerStringHolder);

        int compIntHolder = Integer.parseInt(compStringHolder);

        if (playerIntHolder > compIntHolder) {
            System.out.print("cards will now go to player");
        } else if (playerIntHolder < compIntHolder) {
            System.out.print("cards will now go to computer");
        } else if (playerIntHolder == compIntHolder) {
            System.out.print("wartyme");
        }

    }

    private static int randomPlayerCard() {
        Random random = new Random();
        int playerNumber = random.nextInt(playerRanksAL.size() - 1);
        return playerNumber;
    }

    private static int randomComputerCard() {
        Random random = new Random();
        int computerNumber = random.nextInt(computerRanksAL.size() - 1);
        return computerNumber;
    }
}
