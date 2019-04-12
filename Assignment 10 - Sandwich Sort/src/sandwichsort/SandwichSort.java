/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwichsort;

import java.util.Arrays;

/**
 *
 */
public class SandwichSort {

    /**
     * This method performs the Sandwich Sort algorithm on an array of integers.
     *
     * @param intArray an array of integers
     */
    //find highest and lowest values in array at same time
    // swap the lowest value 
    public static void sandwichSort(int[] intArray) {
        int positionHolder = 0; // position finder
        int adjustment = 0;
        int highest = intArray[0];
        int lowest = intArray[0];
        boolean isSorted = false;
        while (checkIfSorted(intArray) == false) {
            //gets highest integer between the ranges
            for (int a = 0 + adjustment; a < intArray.length; a++) {

                if (intArray[a] > highest) {
                    highest = intArray[a];
                    positionHolder = a;
                }
            }
            swap(intArray, (intArray.length - 1) - adjustment, positionHolder);
            System.out.println("highest: " + highest + "      At position:  " + positionHolder);
            System.out.println("Array:" + Arrays.toString(intArray));

            //gets lowest integer between the ranges
            for (int z = (intArray.length - 1) - adjustment; z > 0; z--) {
                if (intArray[z] < lowest) {
                    lowest = intArray[z];
                    positionHolder = z;
                }
            }
            swap(intArray, adjustment, positionHolder);
            System.out.println("lowest: " + lowest + "       At Position:  " + positionHolder);
            System.out.println("Array:" + Arrays.toString(intArray));

        }
        System.out.println("all done i guess?");
    }

    /**
     * This method the values at 2 positions given their positions
     *
     * @param displacingPosition the position of the high integer
     * @param displacedPosition the value being displaced by the higher integer
     *
     * @param intArray the user's integer array
     */
    public static void swap(int[] intArray, int displacingPosition, int displacedPosition) {
        int holder = intArray[displacedPosition];

        intArray[displacedPosition] = intArray[displacingPosition];
        intArray[displacingPosition] = holder;

    }

    /**
     * This method checks if
     *
     * @param intArray the user's integer array
     */
    public static boolean checkIfSorted(int[] intArray) {
        boolean state = false;
        int previous = intArray[0], holding;
        for (int i = 0; i <= intArray.length - 1; i++) {
            holding = intArray[i];
            if (i == 0) {
                previous = intArray[0];
            } else {
                previous = intArray[i - 1];
            }
            if (previous <= holding) {
                System.out.println ("previous: " + previous + "       " + "holding: " +holding + "     i value: "+ i);
                state = true;
            } else {
                state = false;

            }

        }
        System.out.println("list is sorted = " + state);
        return state;

    }

    /**
     * IGNORE THIS ERROR - it works but net beans just puts an error
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] userArray = {3, 5, 6, 1, 4, 2};

        System.out.println("Original Array: " + Arrays.toString(userArray));
        sandwichSort(userArray);
    }

}
