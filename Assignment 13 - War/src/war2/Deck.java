
package war2;

import java.util.Random;

public class Deck extends Gui {

    int value;
    String suit;

    public Deck() {
        this.value = value;
        this.suit = suit;
    }

    //set up deck, at beginning of game
    public static void initialize() {

        String[] deckSuits = {"Club", "Spade", "Diamond", "Heart"};
        String[] deckValues = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        //ace, 2, 3, 4, 5, 6, 7, 8, 9,10, jack(11), queen (12), king (13)

        String[][] playerHand = new String[4][26];
        String[][] computerHand = new String[4][26];

        for (int i = 0; i<26; i++){
            
        }
        
       System.out.println ("card chosen was the "+ deckValues[randVal()]+ " of "+ deckSuits [randSuit()]);
        
    }
//generates random number from 0 to 12
    private static int randVal() {
        Random value = new Random();
        int val = value.nextInt(12);
        System.out.println (val);
        return val;
    }
    //generates random number from 0 to 3
        private static int randSuit() {
        Random value = new Random();
        int suit = value.nextInt(3);
        System.out.println (suit);
        return suit;
    }

}
