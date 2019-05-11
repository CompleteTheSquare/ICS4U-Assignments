/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hailstone;

public class Hailstone {

    public static int counter = 0;

    /**
     * @param integer is the integer user input
     */
    public static int hailstone(int integer) {
        System.out.println("Integer:" + integer);

        if (integer < 0) {
            return 0;
        }

        if (integer < Integer.MIN_VALUE || integer > Integer.MAX_VALUE) {
            return -1;
        }

        if (integer % 2 == 0) {
            integer = integer / 2;

        } else if (integer % 2 == 1) {
            integer = 3 * integer + 1;
        }
        counter++;
        if (integer != 1) {
            hailstone(integer);
        }
        return counter;
    }

   
    public static void main(String[] args) {
        System.out.println("number of iterations: " + hailstone(100));
    }

}
