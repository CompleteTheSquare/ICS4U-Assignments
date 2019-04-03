/*
Assignment 6 - Anita Yang
ICS4UE (Navarra)
 */
package shakespeare;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 */
public class Shakespeare {

    /**
     * This method takes a filename and returns the number of times the word
     * "thou" appears in it
     *
     * @param filename a String that represents the name of the text file
     * @return the number of times the word "thou" appears in the text file
     * @throws java.io.IOException when the input file is missing
     */
    public static int thouCount(String filename) throws IOException {
        int num = 0;//counts the frequency of "thou" 

        try {
            File inputFile1 = new File(filename);
            Scanner scanner = new Scanner(inputFile1);

            //counts the variations of thou. If the token equals one of the below variations,
            //then it is "thou" and the counter goes up by 1
            while (scanner.hasNextLine()) {
                String holder = "";
                holder = scanner.next();

                if (holder.equals("'Thou")
                        || holder.equals("thou,")
                        || holder.equals("Thou")
                        || holder.equals("thou'ldst")
                        || holder.equals("thou'dst")
                        || holder.equals("thou'ldst")
                        || holder.equals("thou'rt")
                        || holder.equals("thou'dst")
                        || holder.equals("us--thou")
                        || holder.equals("thou'lt")
                        || holder.equals("thou!")
                        || holder.equals("thou's")
                        || holder.equals("thou,")
                        || holder.equals("thou?")
                        || holder.equals("Thou")
                        || holder.equals("Thou,")
                        || holder.equals("Thou")
                        || holder.equals("-thou")
                        || holder.equals("Thou!")
                        || holder.equals("thou'lt")
                        || holder.equals("thou'dst")
                        || holder.equals("thou--")
                        || holder.equals("Thou'rt")
                        || holder.equals("'Thou")
                        || holder.equals("Thou'")
                        || holder.equals("thou'")
                        || holder.equals("thou")
                        || holder.equals("thou'dst")
                        || holder.equals("Thou'lt")) {
                    num = num + 1;
                }
            }
            //prints how many times "thou" has appeared
            System.out.println("Thou appears " + num + " times in " + filename);
        } catch (IOException exception) {
            System.out.println("An error occurred.");
            System.exit(0);
        }
        return num;
    }

    /**
     * This method takes 1 file, replaces all the occurrences of 1 given string
     * with another given string then creates/rewrites a new file with the new
     * text
     *
     * @param oldFilename a String that is the name of the text file read(old)
     * @param newFilename a String that is the name of the text file being
     * written to (new)
     * @param oldWord a String that will be replaced by another word
     * @param newWord a String that replaces the old word in the new file
     * @throws java.io.IOException when the input file, output file, replaced or replacing string is not available
     */
    public static void replaceWord(String oldFilename, String newFilename, String oldWord, String newWord) throws IOException {

        BufferedWriter buffer = null;
        FileWriter file;
        try {
            //reading old file
            File inputFile = new File(oldFilename);
            Scanner scanner = new Scanner(inputFile);

            //writing new file
            file = new FileWriter(newFilename);
            buffer = new BufferedWriter(file);

            String holder = scanner.next(); //holder represents the CURRENT WORD

            while (scanner.hasNextLine()) { //if there is a next line,
                System.out.println(holder); //first, print the holder out

                if (holder.equals(oldWord)) { //if the current word is equal to the old word,
                    buffer.write(newWord);//write the new word in the file in place of the old one

                } else {//if the current word is not the old word,
                    //write the word into the new document with title newOutputFile
                    buffer.write(holder);//if not, just write the current word

                }
                buffer.write(" ");
                holder = scanner.next(); //move to the next word

                buffer.write("\n");//write the next word on a seprarate line
            }

        } catch (IOException exception) {
            System.out.println("An error occurred.");
            System.exit(0);
        }
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException when there are not enough parameters
     */
    public static void main(String[] args) throws IOException {
        try {
            thouCount("hamlet.txt");
            replaceWord("macbeth.txt", "kitten.txt", "the", "kitten");//finds all "the", replaces with "kitten"
        } catch (IOException exception) {
            System.out.println("An error occurred.");
            System.exit(0);
        }

    }
}
