/*
This program iterates the hailstone algorithm as seen in the Collatz conjecture
The program has a number, x, and will process it and return the number of iterations 
it will take for it to reach 1
 */
package hailstone;

public class Hailstone {

    public static int counter = 0;

    /**
     * @param integer is the integer user input
     */
    public static int hailstone(int integer) {

        if (integer < 0) {//checks initial integer if negative or not 
            return 0;
        }

        if (integer % 2 == 0) {//does algorithm
            integer = integer / 2;
            counter++;
            //System.out.println(counter + ": " + integer);          //to check

        } else if (integer % 2 == 1) {
            integer = 3 * integer + 1;
            counter++;
            //System.out.println(counter + ": " + integer);          //to check
        }

        if (integer <= 0) {//if number is larger than max num, then it will be a neg number
            return -1;//return -1 if it is neg num
        } else if (integer == 1) {//if int is 1, return the counter's value
            return counter;
        } else if (integer > 1) {//if int is greater than 1, keep iterating algorithm
            hailstone(integer);
        }

        return counter;
    }

    public static void main(String[] args) {
        int x = 100; //x is the initial number
        System.out.println("initial integer: " + x);
        if (hailstone(x) >= 1) {//prints number of iterations if successsful
            System.out.println("number of iterations: " + hailstone(x));
        } else if (hailstone(x) > 1) {
            System.out.println(hailstone(x));//prints error code
        }

    }
}
