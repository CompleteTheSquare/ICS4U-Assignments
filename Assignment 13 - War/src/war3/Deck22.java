/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Sterling
 */
public class Deck22 extends gui {

    public static ArrayList<String> computerRanks = new ArrayList();
    public static ArrayList<String> playerRanks = new ArrayList();
    public static ArrayList<String> computerSuits = new ArrayList();
    public static ArrayList<String> playerSuits = new ArrayList();

    public static void splitDeck() {

        ArrayList<String> suits = new ArrayList();
        ArrayList<String> ranks = new ArrayList();
        Collections.addAll(suits, "C", "S", "D", "H");
        Collections.addAll(ranks, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13");

        Collections.addAll(computerRanks, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13");
        Collections.addAll(computerSuits, "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "C", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S", "S");

        Collections.addAll(playerRanks, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13");
        Collections.addAll(playerSuits, "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "D", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H");

        System.out.println("starting array:");
        displayCardArrays();
        swapCards(computerRanks, playerRanks, computerSuits, playerSuits);
        System.out.println("ending array:");
        displayCardArrays();

    }


    private static void swapCards(ArrayList<String> computerRanks, ArrayList<String> playerRanks, ArrayList<String> computerSuits, ArrayList<String> playerSuits) {

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

    public static void displayCardArrays() {
System.out.println ("cats");
        System.out.println("computer: " + computerRanks.get(0) + "     " + computerSuits.get(0));
        System.out.println("computer: " + computerRanks.get(1) + "     " + computerSuits.get(1));
        System.out.println("computer: " + computerRanks.get(2) + "     " + computerSuits.get(2));
        System.out.println("computer: " + computerRanks.get(3) + "     " + computerSuits.get(3));
        System.out.println("computer: " + computerRanks.get(4) + "     " + computerSuits.get(4));
        System.out.println("computer: " + computerRanks.get(5) + "     " + computerSuits.get(5));
        System.out.println("computer: " + computerRanks.get(6) + "     " + computerSuits.get(6));
        System.out.println("computer: " + computerRanks.get(7) + "     " + computerSuits.get(7));
        System.out.println("computer: " + computerRanks.get(8) + "     " + computerSuits.get(8));
        System.out.println("computer: " + computerRanks.get(9) + "     " + computerSuits.get(9));
        System.out.println("computer: " + computerRanks.get(10) + "     " + computerSuits.get(10));
        System.out.println("computer: " + computerRanks.get(11) + "     " + computerSuits.get(11));
        System.out.println("computer: " + computerRanks.get(12) + "     " + computerSuits.get(12));
        System.out.println("computer: " + computerRanks.get(13) + "     " + computerSuits.get(13));
        System.out.println("computer: " + computerRanks.get(14) + "     " + computerSuits.get(14));
        System.out.println("computer: " + computerRanks.get(15) + "     " + computerSuits.get(15));
        System.out.println("computer: " + computerRanks.get(16) + "     " + computerSuits.get(16));
        System.out.println("computer: " + computerRanks.get(17) + "     " + computerSuits.get(17));
        System.out.println("computer: " + computerRanks.get(18) + "     " + computerSuits.get(18));
        System.out.println("computer: " + computerRanks.get(19) + "     " + computerSuits.get(19));
        System.out.println("computer: " + computerRanks.get(20) + "     " + computerSuits.get(20));
        System.out.println("computer: " + computerRanks.get(21) + "     " + computerSuits.get(21));
        System.out.println("computer: " + computerRanks.get(22) + "     " + computerSuits.get(22));
        System.out.println("computer: " + computerRanks.get(23) + "     " + computerSuits.get(23));
        System.out.println("computer: " + computerRanks.get(24) + "     " + computerSuits.get(24));
        System.out.println("computer: " + computerRanks.get(25) + "     " + computerSuits.get(25));

        System.out.println("player: " + playerRanks.get(0) + "     " + playerSuits.get(0));
        System.out.println("player: " + playerRanks.get(1) + "     " + playerSuits.get(1));
        System.out.println("player: " + playerRanks.get(2) + "     " + playerSuits.get(2));
        System.out.println("player: " + playerRanks.get(3) + "     " + playerSuits.get(3));
        System.out.println("player: " + playerRanks.get(4) + "     " + playerSuits.get(4));
        System.out.println("player: " + playerRanks.get(5) + "     " + playerSuits.get(5));
        System.out.println("player: " + playerRanks.get(6) + "     " + playerSuits.get(6));
        System.out.println("player: " + playerRanks.get(7) + "     " + playerSuits.get(7));
        System.out.println("player: " + playerRanks.get(8) + "     " + playerSuits.get(8));
        System.out.println("player: " + playerRanks.get(9) + "     " + playerSuits.get(9));
        System.out.println("player: " + playerRanks.get(10) + "     " + playerSuits.get(10));
        System.out.println("player: " + playerRanks.get(11) + "     " + playerSuits.get(11));
        System.out.println("player: " + playerRanks.get(12) + "     " + playerSuits.get(12));
        System.out.println("player: " + playerRanks.get(13) + "     " + playerSuits.get(13));
        System.out.println("player: " + playerRanks.get(14) + "     " + playerSuits.get(14));
        System.out.println("player: " + playerRanks.get(15) + "     " + playerSuits.get(15));
        System.out.println("player: " + playerRanks.get(16) + "     " + playerSuits.get(16));
        System.out.println("player: " + playerRanks.get(17) + "     " + playerSuits.get(17));
        System.out.println("player: " + playerRanks.get(18) + "     " + playerSuits.get(18));
        System.out.println("player: " + playerRanks.get(19) + "     " + playerSuits.get(19));
        System.out.println("player: " + playerRanks.get(20) + "     " + playerSuits.get(20));
        System.out.println("player: " + playerRanks.get(21) + "     " + playerSuits.get(21));
        System.out.println("player: " + playerRanks.get(22) + "     " + playerSuits.get(22));
        System.out.println("player: " + playerRanks.get(23) + "     " + playerSuits.get(23));
        System.out.println("player: " + playerRanks.get(24) + "     " + playerSuits.get(24));
        System.out.println("player: " + playerRanks.get(25) + "     " + playerSuits.get(25));
        System.out.println(" ");
        System.out.println(" ");
    }

}
