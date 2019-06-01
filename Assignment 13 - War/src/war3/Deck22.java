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

        swapCards(computerRanks, playerRanks, computerSuits, playerSuits);

    }

    //generates random number from 0 to 12
    private static int randVal() {
        Random value = new Random();
        int val = value.nextInt(12);
        //System.out.println(val);
        return val;
    }

    //generates random number from 0 to 3
    private static int randSuit() {
        Random value = new Random();
        int suit = value.nextInt(3);
        //System.out.println(suit);
        return suit;
    }

    private static void swapCards(ArrayList<String> computerRanks, ArrayList<String> playerRanks, ArrayList<String> computerSuits, ArrayList<String> playerSuits) {

        
        String[] rankHolder = new String[0];
        String[] suitHolder = new String[0];

 
        for (int i=0; i==26; i++){
            
            rankHolder[0] = computerRanks.get(i);
            suitHolder[0] = computerSuits.get(i);
            
            
            computerRanks.set(i,playerRanks.get(i));
        }
        
        
    }

}
