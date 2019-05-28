package war2;

import java.util.Arrays;
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
        int[] deckValues = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        //ace, 2, 3, 4, 5, 6, 7, 8, 9,10, jack(11), queen (12), king (13)

        int[] deckSuits = {0, 1, 2, 3};
        //club, spade, diamond, heart

        String[][] playerVal = new String[25][1];
        String[][] computerHand = new String[25][1];
        Boolean[][] deckInitialized = new Boolean[12][3];
        String[][] playerHands = new String[51][3];
        //arrays are in order, VAL THEN SUITS

        //initialize array that checks if a card has been placed into a deck yet
        for (int i = 0; i < deckInitialized.length; i++) {
            for (int j = 0; j < deckInitialized[i].length; j++) {
                deckInitialized[i][j] = false;
            }
        }

        for (int i = 0; i < 26; i++) {

            System.out.println("Random Value: " + randVal());
            System.out.println("Random Suit: " + randSuit());

            if (deckInitialized[randVal()][randSuit()] == false) {
                System.out.println("card chosen was the " + deckValues[randVal()] + " of " + deckSuits[randSuit()]);
                deckInitialized[randVal()][randSuit()] = true;
            } else {
                System.out.println("reeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            }

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
