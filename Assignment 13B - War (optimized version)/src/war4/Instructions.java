
package war4;

import javax.swing.JOptionPane;


public class Instructions {
    /**
     * This method generates a JOptionPane and displays game instructions on it
     *
     */
    public static void displayInformation() {
        String messagePart1 = "In the game of War, you and your opponents keeps drawing cards. Whoever has the highest ranking takes both cards.";
        String messagePart2 = "If you and your opponent both draw the same ranking cards, it is war. Both players place 3 cards, then flip the last one.";
        String messagePart3 = "Whoever wins, takes all cards.";
        String messagePart4 = "If there is a tie in the war, the game will randomly give all 10 cards on the field to the player or the computer.";
        String space = "\n " + "\n";
        JOptionPane.showMessageDialog(null, messagePart1 + space + messagePart2 + space + messagePart3 + space + messagePart4);
    }
}
