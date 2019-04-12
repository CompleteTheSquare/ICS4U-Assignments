/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwichsort2;

import java.util.Arrays;

/**
 *
 * @author Sterling
 */
public class SandwichSort2 {

    /**
     *
     *
     * checks if the array is in order
     *
     * if yes, return the array to the main method
     *
     * if no, send the array to the sort method
     *
     * @param state is true when the array is properly sorted else false
     */
    public static int[] checkIfSorted(int[] intArray) {
        boolean state = true;
        
        int[] sortedArray= intArray;

        for (int index = 0; index <= intArray.length - 2;
                index++) {

            if (intArray[index] > intArray[index + 1]) {
                state = false;
                System.out.println(intArray[index] + " is more than " + intArray[index + 1]);
                sandwichSort(intArray);

            } else {
                System.out.println(intArray[index] + " is less than " + intArray[index + 1]);
            }
        }

        return sortedArray;
    }

    public static void sandwichSort(int[] intArray) {
        
        int positionHolder = 0; // position finder
        int adjustment = 0;
        int highest = intArray[0];
        int lowest = intArray[0];
        
         for (int a = 0 + adjustment; a < intArray.length; a++) {

            if (intArray[a] > highest) {
                highest = intArray[a];
                positionHolder = a;
            }
        }
        //swap(intArray, (intArray.length - 1) - adjustment, positionHolder);
        System.out.println("highest: " + highest + "      At position:  " + positionHolder);
        System.out.println("Array:" + Arrays.toString(intArray));

        //gets lowest integer between the ranges
        for (int z = (intArray.length - 1) - adjustment; z > 0; z--) {
            if (intArray[z] < lowest) {
                lowest = intArray[z];
                positionHolder = z;
            }
        }
        //swap(intArray, adjustment, positionHolder);
        System.out.println("lowest: " + lowest + "       At Position:  " + positionHolder);
        System.out.println("Array:" + Arrays.toString(intArray));
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] userArray = {3, 5, 6, 1, 4, 2};
        System.out.println(Arrays.toString(checkIfSorted(userArray)));
    }

}
