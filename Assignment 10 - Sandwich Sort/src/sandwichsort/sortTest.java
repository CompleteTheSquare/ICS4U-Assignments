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
public class sortTest {

    public static boolean checkIfSorted(int[] intArray) {

        boolean sortedState = false;
        
        
        //holder and previous hold the array's item themselves
        int holder= intArray[0];
        int previous;
        
       //if (holder = intArray[0]){
     // previous = intArray[0];
      // }
        
        
return sortedState;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] userArray = {3, 5, 6, 1, 4, 2};

        System.out.println("Original Array: " + Arrays.toString(userArray));

        System.out.println(checkIfSorted(userArray));
    }
}
