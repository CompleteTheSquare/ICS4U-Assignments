package war4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sterling
 */
public class Save extends Gameplay {

    static ArrayList<String> names = new ArrayList<String>();
    static ArrayList<String>  score = new ArrayList<String>();

    
    public static void displaySaveInfo() {
   
        String playerName;
        int position;
    playerName = JOptionPane.showInputDialog ("High score, what is your name?");
    
    names.add(playerName);
    score.add(Integer.toString(counter));
    

        //Collections.sort (score);
        /*
    for (int i = 0; i<=names.size()-1; i++){
        if (score.get(i).equals (Integer.toString(counter))){
            score.add (score.get(names.size()-1));
        }
    }
            if (score.get(i).equals (Integer.toString(counter))){
        

            score.add (score.get(score.size()-1));
            score.set (score.size()-2,score.get(score.size()-3) );
         score.set (score.size()-2,score.get(score.size()-3) );
        
                           */    
        JOptionPane.showMessageDialog (null, "High score successfully saved");
    
    
    
    }
    
    //reads in information
    public static void load() throws IOException {

        try {
            String nameHolder;
            int scoreHolder;
            File inputFile = new File("src/war4/save.txt");
            Scanner scanner = new Scanner(inputFile);

            for (int i = 0; i <= 4; i++) {
                names.add(scanner.nextLine());
                score.add(scanner.nextLine());
            }
            System.out.println("Loaded values (txt to game):");
            System.out.println("Name0: " + names.get(0));
            System.out.println("Score0: " + score.get(0));


            System.out.println("success - file loading");

        } catch (IOException exception) {
            System.out.println("oof - file loading");
        }

    }
    /*
//saves the information
    public static void save() throws IOException {

        try {
//opens file
            FileWriter file = new FileWriter("src\\seal\\save.txt");
            BufferedWriter buffer = new BufferedWriter(file);

//converts everything to a String then outputs it onto the file
            buffer.write((name) + "\n");
            buffer.write(Integer.toString(maxHP) + "\n");
            buffer.write(Integer.toString(currentHP) + "\n");
            buffer.write(Integer.toString(Atk) + "\n");
            buffer.write(Integer.toString(Def) + "\n");
            buffer.write(Integer.toString(Gold) + "\n");
            buffer.close();
            System.out.println("Saved values to (game to txt):");
            System.out.println("Name: " + name);
            System.out.println("Max HP " + maxHP);
            System.out.println("Current HP: " + currentHP);
            System.out.println("Atk: " + Atk);
            System.out.println("Def: " + Def);
            System.out.println("Gold" + Gold);
            System.out.println("success - file saving");
        } catch (IOException exception) {
            System.out.println("oof - file saving");
        }
    }

    public static void createNewGame() throws IOException {
        try {
            File file = new File("src\\seal\\save.txt");
            file.createNewFile();
        } catch (IOException exception) {

        }
    }
     */
}
