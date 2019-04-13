package sandwichsort4;

import java.util.Arrays;

public class SandwichSort4 {

// these are discuss later but critical to program's successful run
    public static int highAdjustment = 1;//holds the upper bounds in array
    public static int lowAdjustment = 0;//holds lower bounds in array

    /**
     * @param intArray the inputted integer array
     */
    //to see intermediates of the sort, uncomment the lines with 4 forward slashes
    public static void sandwichSort(int[] intArray) {

        //prints the user's original array out
        System.out.println("Original Array: " + Arrays.toString(intArray));
        System.out.println("--------------------------------");

        // makes sure you swap until the entire array is sorted.
        for (int numberOfRepeats = 0; numberOfRepeats < intArray.length / 2; numberOfRepeats++) {

            //set comparing point to the middle of the array and default starting indexes to 0
            int indexOfHighest = 0, indexOfLowest = 0;
            int highest = intArray[intArray.length / 2];
            int lowest = intArray[intArray.length / 2];

            ////System.out.println("Starting with: " + Arrays.toString(intArray));
            //get the highest element between the middle elements, excluding the outer elements each iteration                      
            for (int index = lowAdjustment; index <= intArray.length - highAdjustment; index++) {

                if (intArray[index] >= highest) {
                    highest = intArray[index];
                    indexOfHighest = index;
                }
            }

            //swaps the highest element with the element in new highest position
            swap(intArray, indexOfHighest, intArray.length - highAdjustment);
            ////System.out.println("Swapping highest: " + Arrays.toString(intArray));

            //get the lowest element between the middle elements, excluding the outer elements each iteration    
            for (int index = lowAdjustment; index <= intArray.length - highAdjustment; index++) {
                if (intArray[index] <= lowest) {
                    lowest = intArray[index];
                    indexOfLowest = index;
                }
            }

            swap(intArray, indexOfLowest, lowAdjustment);
            ////System.out.println("Swapping Lowest: " + Arrays.toString(intArray));
            ////System.out.println("--------------------------------");

            //for every iteration of the array, the array being worked on gets smaller
            //these make sure the array gets smaller for each iteration else Stack Overflow Error
            lowAdjustment++;
            highAdjustment++;
        }

        //prints sorted array out at the end
        System.out.println("Sorted Array: " + Arrays.toString(intArray));

    }

    /**
     * @param array the array in which its elements are being swapped
     * @param displacingPosition the element of the array that is highest/lowest
     * and "kicks another element out"
     * @param displacedPosition the element of the array being "kicked out" and
     * sent to the displacedPosition spot
     */
    public static void swap(int[] array, int displacingPosition, int displacedPosition) {
        int holder = array[displacedPosition];
        array[displacedPosition] = array[displacingPosition];
        array[displacingPosition] = holder;
    }

    public static void main(String[] args) {
        int[] intArray = {3, 5, 6, 1, 4, 2,};

        sandwichSort(intArray);
    }

}
