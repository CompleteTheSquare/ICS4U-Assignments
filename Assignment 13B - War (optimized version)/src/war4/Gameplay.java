/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war4;

/**
 *
 * @author Sterling
 */
public class Gameplay extends Gui {

    //pick random card from either player's hand and store the random card's values and suits into an array
    //whoever has a higher rank (string) will win
    protected static void compareValues() {

        int playerRankLastCard = playerRanksAL.size() - 1;//the last card in player deck
        int computerRankLastCard = computerRanksAL.size() - 1;// the last card in the computer deck

        //holds the string retrieved from the array
        String pStringHolder = playerRanksAL.get(playerRankLastCard);
        String cStringHolder = computerRanksAL.get(computerRankLastCard);

        int playerIntHolder = Integer.parseInt(pStringHolder);
        int computerIntHolder = Integer.parseInt(cStringHolder);
        System.out.println(playerRanksAL);
        System.out.println(playerSuitsAL);
        System.out.println("");
        System.out.println(computerRanksAL);
        System.out.println(computerSuitsAL);
        System.out.println("");
        System.out.println("last card from player hand is  " + playerRanksAL.get(playerRankLastCard) + "         " + playerSuitsAL.get(playerRankLastCard));
        System.out.println("last card from computer hand is  " + computerRanksAL.get(computerRankLastCard) + "         " + computerSuitsAL.get(computerRankLastCard));

        
        if (playerIntHolder>computerIntHolder){
            System.out.println ("Player card is bigger");
        }
        else if (playerIntHolder<computerIntHolder){
          System.out.println ("Computer card is bigger");  
        }
        else if (playerIntHolder==computerIntHolder){
            System.out.println ("war");
        }
    }

}
