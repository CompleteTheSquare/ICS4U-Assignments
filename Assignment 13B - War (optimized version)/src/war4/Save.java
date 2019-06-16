package war4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sterling
 */
public class Save extends Gameplay {

    static ArrayList<String> score = new ArrayList<String>();
    static ArrayList<String> name = new ArrayList<String>();
    static String data = "";

    //reads in information
    public static void load() throws IOException {
        int count = 0;
        try {

            File scoreFile = new File("src/war4/save.txt");
            File nameFile = new File("src/war4/name.txt");
            Scanner nameScanner = new Scanner(nameFile);
            Scanner scoreScanner = new Scanner(scoreFile);

            while (nameScanner.hasNextLine()) {
                String holder1 = nameScanner.nextLine();
                String holder2 = scoreScanner.nextLine();
                name.add(holder1);
                score.add(holder2);
                data = data + " " + (count + 1) + ".    " + score.get(count) + "     " + name.get(count) + "\n";
                count++;
            }

        } catch (IOException exception) {
        JOptionPane.showMessageDialog(null, "There has been a problem loading the scores");
        }

    }

    public static void displayLeaderboard() {
        JOptionPane.showMessageDialog(null, data);

    }

    public static void Save() throws IOException {
        String holder = JOptionPane.showInputDialog(null, "You have won the game! What is your name?");
        name.add(holder);
        score.add(Integer.toString(counter));

        try {

            FileWriter scoreFile = new FileWriter("src/war4/save.txt");
            FileWriter nameFile = new FileWriter("src/war4/name.txt");
            BufferedWriter scoreWriter = new BufferedWriter(scoreFile);
            BufferedWriter nameWriter = new BufferedWriter(nameFile);
            int scoreHolder;
            String nameHold = "";
            String scoreHold = "";
            for (int i = 0; i < score.size(); i++) {
                nameHold = nameHold + name.get(i) + "\n";
                scoreHold = scoreHold + score.get(i) + "\n";
            }
            scoreWriter.write(scoreHold);
            nameWriter.write(nameHold);

            scoreWriter.close();
            nameWriter.close();

            JOptionPane.showMessageDialog(null, "High score successfully saved");
        } catch (IOException exception) {


        }

    }
}
