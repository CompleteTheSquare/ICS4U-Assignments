/*

 */
package arraystatistics;

import java.util.Arrays;

/**
 *
 */
public class ArrayStatistics {

    /**
     * This method takes an array of doubles and returns the lowest one Example:
     * lowestNum([-1.5, 4.1, -6.0, 10.06, 3.004]) => -6.0
     *
     * If the array is empty, it returns 0.0
     *
     * @param array1 an array of doubles
     * @return the lowest double in array; 0 if empty
     */
    public static double lowestNum(double[] array1) {
        double holder = 0.0;
        for (int i = 0; i < array1.length; i++) {

            if (array1[i] < holder) {
                holder = array1[i];
            }
        }
        return holder;
    }

    /**
     * This method takes an array of ints and returns the product of all its
     * even ints Example: evenProduct([-1, 4, -6, 10, 3]) => -240
     *
     * If there are no even ints or the array is empty, it returns 1 Example:
     * evenProduct([1, 3, 5, 7]) => 1
     *
     * @param array2 an array of ints
     * @return the product of all the even ints in array; 1 if there are none
     */
    public static int evenProduct(int[] array2) {
        int holder = 1;
        for (int i = 0; i < array2.length; i++) {

            if (array2[i] % 2 == 0) {
                holder = holder * array2[i];
            }
        }
        return holder;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] array1 = {-1.5, 4.1, -6.0, 10.06, 3.004};
        int[] array2 = {-1, 4, -6, 10, 3};

        System.out.println(lowestNum(array1));
        System.out.println(evenProduct(array2));
    }

}
