package war;

import java.util.*;

public class Deck extends Interface {

    String cardSuit;
    int cardValue;

    public Deck(int cardValue, String cardSuit) {
        this.cardSuit = cardSuit;
        this.cardValue = cardValue;
        
        ArrayList<Integer> values = new ArrayList<Integer>();
        Collections.addAll(values, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        
        ArrayList<String> suits = new ArrayList<String>();
        Collections.addAll(suits, "club", "spade", "diamond", "heart");
        //club = 0, spade = 1, diamond = 2, heart = 3
    }
    
    //splits deck in 2 at beginning of game
    public static void divideDeck(){
        ArrayList <ArrayList<Integer>> shown = new ArrayList <ArrayList<Integer>>();
        
        
    }
            

}
