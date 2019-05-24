/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sterling
 */
public class Save extends Interface {

    public static boolean checkPreviousSaves() throws IOException {

        File inputFile = new File("src\\seal\\save.txt");
        Scanner scanner = new Scanner(inputFile);

        if (inputFile.exists()) {
            return true;
        }
        return false;
    }

    //reads in information
    public static void load() throws IOException {

        try {
            File inputFile = new File("src\\seal\\save.txt");
            Scanner scanner = new Scanner(inputFile);
            name = scanner.nextLine();
            maxHP = Integer.parseInt(scanner.nextLine());
            currentHP = Integer.parseInt(scanner.nextLine());
            Atk = Integer.parseInt(scanner.nextLine());
            Def = Integer.parseInt(scanner.nextLine());
            Gold = Integer.parseInt(scanner.nextLine());

            System.out.println("Loaded values (txt to game):");
            System.out.println("Name: " + name);
            System.out.println("Max HP " + maxHP);
            System.out.println("Current HP: " + currentHP);
            System.out.println("Atk: " + Atk);
            System.out.println("Def: " + Def);
            System.out.println("Gold" + Gold);
            System.out.println("success - file loading");

        } catch (IOException exception) {
            System.out.println("oof - file loading");
        }
    }

//saves the information
    public static void save() throws IOException {
        /**
 name = "MewTwo";
maxHP = 150;
currentHP = 150;
 Atk = 150;
Def = 150;
Gold = 150;
**/

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

}
