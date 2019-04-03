/*
 * Assignment 4
 */
package shapes;

/**
 *
 * @author anonymous
 */
public class Rectangle {

    /**
     * This method takes the length and width of a rectangle and returns the
     * rectangle's area.
     *
     * @param l the length of the rectangle
     * @param w the width of the rectangle
     * @return the area of the rectangle with length l and width w  
     */
    public static double RectangleArea(double l, double w) {
        return l * w;
    }

    /**
     * This method takes the length and width of a rectangle and returns the
     * rectangle's perimeter.
     *
     * @param l the length of the rectangle
     * @param w the width of the rectangle
     * @return the perimeter of the rectangle with length l and width w
     */
    public static double RectanglePerimeter(double l, double w) {
        return 2 * (l * w);
    }

}
