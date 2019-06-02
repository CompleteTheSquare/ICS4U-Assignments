/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war3;

import java.util.Random;

/**
 *
 * @author Sterling
 */
public class Deck extends gui {

    //int[] suit = {0,1,2,3};
    //0=clubs, 1=spades, 2 = diamonds, 3= hearts
    //int[] value = {0,1,2,3,4,5,6,7,8,9,10,11,12};
    public static boolean[][] check = new boolean[12][3]; //
    public static int[][] deck = new int[12][3];
    public static int[][] playerHand = new int[12][3];
    public static int[][] computerHand = new int[12][3];
    public static int counter = 0;

    public static void SplitDeck() {

        //check if the card is in a deck already 
        //then use counter modulus to put it in a deck
        do {
            int val = randVal();
            int suit = randSuit();
            if (check[val][suit] == false) {
                System.out.println("potato " + val + "  " + suit);
                if (counter % 2 == 0) {
                    System.out.println("yeet " + val + "  " + suit);
                } else if (counter % 2 == 1) {
                    System.out.println("feet " + val + "  " + suit);
                }
                counter++;
                check[val][suit] = true;
                System.out.println(counter);
            } else {
                SplitDeck();
            }
        } while (counter < 52);
        {
            System.out.println("oof");
        }
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

}
