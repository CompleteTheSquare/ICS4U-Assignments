/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwichsort;

import java.util.Arrays;

/**
 *
 * @author Sterling
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

        //gets highest integer between the ranges
        for (int a = 0 + adjustment; a < intArray.length; a++) {

            if (intArray[a] > highest) {
                highest = intArray[a];
                positionHolder = a;
            }
        }
        System.out.println(highest + "    " + positionHolder);

        //gets lowest integer between the ranges
        for (int z = (intArray.length - 1) - adjustment; z > 0; z--) {
            if (intArray[z] < lowest) {
                lowest = intArray[z];
                positionHolder = z;
            }
        }
            System.out.println(lowest+ "    " + positionHolder); 
            
            
            
        
        
        
        
        /*          
        int adjustment = 0; //holds adjustment for array endings during iterations
        int highest = intArray[0];
        int lowest = intArray[0];
        int numberOfElements = intArray.length - 1;
        int holder, positionHolder=0;

//find highest value in array
        for (int i = 0 + adjustment; i < intArray.length; i++) {

            if (intArray[i] > highest) {
                highest = intArray[i];
                positionHolder = i;
            }
            
            
            
            //place the highest integer in the correct spot
        holder = intArray[0 + adjustment];
        intArray[0 + adjustment] = highest;
        intArray[i] = positionHolder;
                System.out.println("Highest is: " + highest);
                        System.out.println("New Array: " + Arrays.toString(intArray));
        }
/*
//find lowest value in array
        for (int n = (numberOfElements - adjustment); n >= 0; n--) {
            if (intArray[n] < lowest) {
                lowest = intArray[n];
                positionHolder = n;
            }
        }
        System.out.println("Lowest is: " + lowest);

         */
    }

    
    
    
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
