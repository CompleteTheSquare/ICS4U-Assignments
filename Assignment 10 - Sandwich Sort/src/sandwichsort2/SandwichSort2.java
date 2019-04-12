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

        int[] sortedArray = intArray;

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
        int highest = intArray[0], lowest = intArray[0]; //keeps highest and lowest value, default first number in array
        int highestPosition = 0, lowestPosition = 0;

//find the highest value in the element
        for (int a = 0; a <= intArray.length - 1; a++) {
            if (intArray[a] > highest) {
                highest = intArray[a];
                highestPosition = a;
            }
        }
        System.out.println("Highest value in array: " + highest + "   Index:  " + highestPosition);

        //find the lowest value in the element
        for (int z = 0; z <= intArray.length - 1; z++) {
            if (intArray[z] < highest) {
                lowest = intArray[z];
                lowestPosition = z;
            }
        }
        System.out.println("Lowest value in array: " + lowest + "   Index:  " + lowestPosition);
        
        
    }

    public static void swap(int[] intArray, int displacingPosition, int displacedPosition) {
        int holder = intArray[displacedPosition];

        intArray[displacedPosition] = intArray[displacingPosition];
        intArray[displacingPosition] = holder;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = {3, 5, 6, 1, 4, 2};

        System.out.println("Original Array: " + Arrays.toString(intArray));
        System.out.println(Arrays.toString(checkIfSorted(intArray)));
        System.out.println("end");
    }

}
