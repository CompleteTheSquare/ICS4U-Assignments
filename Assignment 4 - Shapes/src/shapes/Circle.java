/*

 */
package shapes;

/**
 *
 * @author anonymous
 */
public class Circle {

    /**
     * This method takes the radius of a circle and returns the circle's area.
     *
     * @param r the radius of the circle
     * @return the area of the circle with radius r
     */
    public static double CircleArea(double r) {

        return r * r * Math.PI;
    }

    /**
     * This method takes the radius of a circle and returns its circumference.
     *
     * @param r the radius of the circle
     * @return the circle's circumference
     */
    public static double Circumference(double r) {
        return 2 * r;

    }

}
