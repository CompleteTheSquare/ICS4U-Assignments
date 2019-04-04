/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Sterling
 */
public class WordSearch {

    /**
     * This method takes a "word" and uses a binary search algorithm to
     * determine whether it is in the file 5000Words.txt.
     *
     * @param word a String that represents the word you want to check
     * @return true if word is in 5000Words.txt; false otherwise
     * @throws java.io.IOException when the file 5000Words.txt is missing
     */
    //read in entire file first
    //store each word in an array
    //do the binary thing
    public static boolean isCommonWord(String word) throws IOException {

        String[] array = new String[5000];

        try {

            //import file
            Scanner scanner = new Scanner(new File("key.txt"));

            while (scanner.hasNextLine()) {
                for (int i = 0; i < 5000; i++) {
                    array[i] = scanner.nextLine();
                    System.out.println("from array, element: " + i + " value: " + array[i]);
                }

            }
            System.out.println(Arrays.toString(array));

        } catch (IOException exception) {
            System.out.println("something broke in the isCommonWord method");
        }

        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            isCommonWord("cat");
        } catch (IOException exception) {
            System.out.println("something broke in the main method");
        }

    }

}


/*
            
 */
