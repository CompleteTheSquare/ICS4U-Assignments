/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwichsort4;

import java.util.Arrays;

public class SandwichSort4 {

    public static int highAdjustment = 1;//holds the upper bounds in array
    public static int lowAdjustment = 0;//holds lower bounds in array

    public static void sandwichSort(int[] intArray) {

        int indexOfHighest = 0, indexOfLowest = 0;
        int highest = intArray[intArray.length / 2];
        int lowest = intArray[intArray.length / 2];

        System.out.println("Original Array: " + Arrays.toString(intArray));
        System.out.println ("--------------------------------");
        //getHighest1
        for (int index = lowAdjustment; index <= intArray.length - highAdjustment; index++) {

            if (intArray[index] >= highest) {
                highest = intArray[index];
                indexOfHighest = index;
            }
        }
        System.out.println("\n");
        System.out.println("Index of highest : " + indexOfHighest);
        System.out.println("Value of highest: " + highest);
        swap(intArray, indexOfHighest, intArray.length - highAdjustment);
        System.out.println(Arrays.toString(intArray));

        //getLowest1
        for (int index = lowAdjustment; index <= intArray.length - highAdjustment; index++) {
            if (intArray[index] <= lowest) {
                lowest = intArray[index];
                indexOfLowest = index;
            }
        }
        System.out.println("\n");
        System.out.println("Index of lowest : " + indexOfLowest);
        System.out.println("Value of lowest: " + lowest);
        swap(intArray, indexOfLowest, lowAdjustment);
        System.out.println(Arrays.toString(intArray));
                System.out.println ("--------------------------------");

        lowAdjustment++;
        highAdjustment++;

        indexOfHighest = 0;
        indexOfLowest = 0;
        highest = intArray[intArray.length / 2];
        lowest = intArray[intArray.length / 2];
                //getHighest2
        for (int index = lowAdjustment; index <= intArray.length - highAdjustment; index++) {

            if (intArray[index] >= highest) {
                highest = intArray[index];
                indexOfHighest = index;
            }
        }
        System.out.println("\n");
        System.out.println("Index of highest : " + indexOfHighest);
        System.out.println("Value of highest: " + highest);
        swap(intArray, indexOfHighest, intArray.length - highAdjustment);
        System.out.println(Arrays.toString(intArray));

        //getLowest2
        for (int index = lowAdjustment; index <= intArray.length - highAdjustment; index++) {
            if (intArray[index] <= lowest) {
                lowest = intArray[index];
                indexOfLowest = index;
            }
        }
        System.out.println("\n");
        System.out.println("Index of lowest : " + indexOfLowest);
        System.out.println("Value of lowest: " + lowest);
        swap(intArray, indexOfLowest, lowAdjustment);
        System.out.println(Arrays.toString(intArray));
        System.out.println ("--------------------------------");
        
        lowAdjustment++;
        highAdjustment++;
        indexOfHighest = 0;
        indexOfLowest = 0;
        highest = intArray[intArray.length / 2];
        lowest = intArray[intArray.length / 2];
        //getHighest3
        for (int index = lowAdjustment; index <= intArray.length - highAdjustment; index++) {
System.out.println ("INDEX: "+ index);
            if (intArray[index] >= highest) {
                highest = intArray[index];
                indexOfHighest = index;
            }
        }
        System.out.println("\n");
        System.out.println("Index of highest : " + indexOfHighest);
        System.out.println("Value of highest: " + highest);
        swap(intArray, indexOfHighest, intArray.length - highAdjustment);
        System.out.println(Arrays.toString(intArray));

        //getLowest3
        for (int index = lowAdjustment; index <= intArray.length - highAdjustment; index++) {
            if (intArray[index] <= lowest) {
                lowest = intArray[index];
                indexOfLowest = index;
            }
        }
        System.out.println("\n");
        System.out.println("Index of lowest : " + indexOfLowest);
        System.out.println("Value of lowest: " + lowest);
        swap(intArray, indexOfLowest, lowAdjustment);
        System.out.println(Arrays.toString(intArray));


    }

    public static void swap(int[] array, int displacingPosition, int displacedPosition) {
        int holder = array[displacedPosition];
        array[displacedPosition] = array[displacingPosition];
        array[displacingPosition] = holder;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = {3, 5, 6, 1, 4, 2};

        sandwichSort(intArray);
    }

}
