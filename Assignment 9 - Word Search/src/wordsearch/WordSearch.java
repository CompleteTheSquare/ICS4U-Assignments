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
    
    
    //creates an array and read in entire file first
    //store each word in an array (not arraylist)
    //then do binary search with the array
    public static boolean isCommonWord(String word) throws IOException {

        String[] array = new String[5000];

        try {

            //import file
            Scanner scanner = new Scanner(new File("key.txt"));
//stores all the words in the file into array
            while (scanner.hasNextLine()) {
                for (int i = 0; i < 5000; i++) {
                    array[i] = scanner.nextLine();
                }

            }
            //System.out.println(Arrays.toString(array)); 
            //if the code breaks, uncomment this line and see if it runs
            //if the code still doesn't work, pull from github 
            
            int low = 0, high = array.length - 1;//upper and lower ranges of sort
            while (true) {
                int midpoint = (low + high) / 2;

                if (low == high && array[midpoint] != word) {
                    return false;
                }

                if ((word.compareTo(array[midpoint]) > 0)) {
                    high = midpoint - 1;

                } else if (word.compareTo(array[midpoint]) > 0) {
                    low = midpoint + 1;
                } else {
                    return true;
                }
            }
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
            String word = "kitten"; //insert word here
            System.out.println("The word " + word+ " is a common word: " +isCommonWord(word));
        } catch (IOException exception) {
            System.out.println("something broke in the main method");
        }

    }

}
