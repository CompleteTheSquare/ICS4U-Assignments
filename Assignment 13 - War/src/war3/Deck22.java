package war3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

public class Deck22 extends gui {

    public static String[] computerRanks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
    public static String[] computerSuits = {"C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S"};
    public static String[] playerRanks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
    public static String[] playerSuits = {"D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H"};

    public static void splitDeck() {

        System.out.println("starting array:");
        //displayCardArrays();
        shuffle(computerRanks, playerRanks, computerSuits, playerSuits);
        //swapCards(computerRanks, playerRanks, computerSuits, playerSuits);
        //System.out.println("ending array:");
        //displayCardArrays();

    }

    /*
    private static void swapCards(computerRanks[], playerRanks[], computerSuits[], playerSuits[]) {

        String[] rankHolder = new String[0];
        String[] suitHolder = new String[0];

        for (int i = 0; i < 2; i++) {
System.out.println ("yeet");
            rankHolder[0] = computerRanks.get(i);
            suitHolder[0] = computerSuits.get(i);

            computerRanks.set(i, playerRanks.get(i));
            computerSuits.set(i, playerSuits.get(i));

            playerRanks.set(i, rankHolder[0]);
            playerSuits.set(i, suitHolder[0]);
        }

    }
     */
    public static void shuffle(String[] computerRanks, String[] playerRanks, String[] computerSuits, String[] playerSuits) {
        String[] rankHolder = {"defaultRank"};
        String[] suitHolder = {"defaultSuit"};
        System.out.println("rankholder: " + rankHolder[0]);
        System.out.println("suitholder: " + suitHolder[0]);
        System.out.println("computerRanks: " + computerRanks[0]);
        System.out.println("computerSuits: " + computerSuits[0]);
        System.out.println("playerRanks: " + playerRanks[0]);
        System.out.println("playerSuits: " + playerSuits[0]);

        rankHolder[0] = computerRanks[0];
        suitHolder[0] = computerSuits[0];

        computerRanks[0] = playerRanks[0];
        computerSuits[0] = playerSuits[0];

        playerRanks[0] = rankHolder[0];
        playerSuits[0] = suitHolder[0];

        System.out.println(" ");
        System.out.println("switched");
        System.out.println("rankholder: " + rankHolder[0]);
        System.out.println("suitholder: " + suitHolder[0]);
        System.out.println("computerRanks: " + computerRanks[0]);
        System.out.println("computerSuits: " + computerSuits[0]);
        System.out.println("playerRanks: " + playerRanks[0]);
        System.out.println("playerSuits: " + playerSuits[0]);
    }

    public static void displayCardArrays() {
        System.out.println("cats");
        System.out.println("computer: " + computerRanks[0] + "     " + computerSuits[0]);
        System.out.println("computer: " + computerRanks[1] + "     " + computerSuits[1]);
        System.out.println("computer: " + computerRanks[2] + "     " + computerSuits[2]);
        System.out.println("computer: " + computerRanks[3] + "     " + computerSuits[3]);
        System.out.println("computer: " + computerRanks[4] + "     " + computerSuits[4]);
        System.out.println("computer: " + computerRanks[5] + "     " + computerSuits[5]);
        System.out.println("computer: " + computerRanks[6] + "     " + computerSuits[6]);
        System.out.println("computer: " + computerRanks[7] + "     " + computerSuits[7]);
        System.out.println("computer: " + computerRanks[8] + "     " + computerSuits[8]);
        System.out.println("computer: " + computerRanks[9] + "     " + computerSuits[9]);
        System.out.println("computer: " + computerRanks[10] + "     " + computerSuits[10]);
        System.out.println("computer: " + computerRanks[11] + "     " + computerSuits[11]);
        System.out.println("computer: " + computerRanks[12] + "     " + computerSuits[12]);
        System.out.println("computer: " + computerRanks[13] + "     " + computerSuits[13]);
        System.out.println("computer: " + computerRanks[14] + "     " + computerSuits[14]);
        System.out.println("computer: " + computerRanks[15] + "     " + computerSuits[15]);
        System.out.println("computer: " + computerRanks[16] + "     " + computerSuits[16]);
        System.out.println("computer: " + computerRanks[17] + "     " + computerSuits[17]);
        System.out.println("computer: " + computerRanks[18] + "     " + computerSuits[18]);
        System.out.println("computer: " + computerRanks[19] + "     " + computerSuits[19]);
        System.out.println("computer: " + computerRanks[20] + "     " + computerSuits[20]);
        System.out.println("computer: " + computerRanks[21] + "     " + computerSuits[21]);
        System.out.println("computer: " + computerRanks[22] + "     " + computerSuits[22]);
        System.out.println("computer: " + computerRanks[23] + "     " + computerSuits[23]);
        System.out.println("computer: " + computerRanks[24] + "     " + computerSuits[24]);
        System.out.println("computer: " + computerRanks[25] + "     " + computerSuits[25]);

        System.out.println("player: " + playerRanks[0] + "     " + playerSuits[0]);
        System.out.println("player: " + playerRanks[1] + "     " + playerSuits[1]);
        System.out.println("player: " + playerRanks[2] + "     " + playerSuits[2]);
        System.out.println("player: " + playerRanks[3] + "     " + playerSuits[3]);
        System.out.println("player: " + playerRanks[4] + "     " + playerSuits[4]);
        System.out.println("player: " + playerRanks[5] + "     " + playerSuits[5]);
        System.out.println("player: " + playerRanks[6] + "     " + playerSuits[6]);
        System.out.println("player: " + playerRanks[7] + "     " + playerSuits[7]);
        System.out.println("player: " + playerRanks[8] + "     " + playerSuits[8]);
        System.out.println("player: " + playerRanks[9] + "     " + playerSuits[9]);
        System.out.println("player: " + playerRanks[10] + "     " + playerSuits[10]);
        System.out.println("player: " + playerRanks[11] + "     " + playerSuits[11]);
        System.out.println("player: " + playerRanks[12] + "     " + playerSuits[12]);
        System.out.println("player: " + playerRanks[13] + "     " + playerSuits[13]);
        System.out.println("player: " + playerRanks[14] + "     " + playerSuits[14]);
        System.out.println("player: " + playerRanks[15] + "     " + playerSuits[15]);
        System.out.println("player: " + playerRanks[16] + "     " + playerSuits[16]);
        System.out.println("player: " + playerRanks[17] + "     " + playerSuits[17]);
        System.out.println("player: " + playerRanks[18] + "     " + playerSuits[18]);
        System.out.println("player: " + playerRanks[19] + "     " + playerSuits[19]);
        System.out.println("player: " + playerRanks[20] + "     " + playerSuits[20]);
        System.out.println("player: " + playerRanks[21] + "     " + playerSuits[21]);
        System.out.println("player: " + playerRanks[22] + "     " + playerSuits[22]);
        System.out.println("player: " + playerRanks[23] + "     " + playerSuits[23]);
        System.out.println("player: " + playerRanks[24] + "     " + playerSuits[24]);
        System.out.println("player: " + playerRanks[25] + "     " + playerSuits[25]);

        System.out.println(" ");
        System.out.println(" ");
    }

}
