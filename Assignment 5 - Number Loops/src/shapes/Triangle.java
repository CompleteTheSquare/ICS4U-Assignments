/*
 * Assignment 4
 */
package shapes;

/**
 *
 * @author anonymous
 */
public class Triangle {
    
    
    /**
     * This method takes the side lengths of a triangle and returns the triangle's area.
     * @param h the height of the triangle
     * @param b the base length of the triangle
     * @return the area of the triangle with base b and height h
     */ 
        
    public static double TriangleArea(double b, double h) {
return (0.5)*h*b;

    }
 
    /**
     * This method takes the side lengths of a triangle and returns the triangle's perimeter.
     * @param a the first side length of the triangle
     * @param b the second side length of the triangle
     * @param c the third side length of the triangle
     * @return the perimeter of the triangle with side lengths a, b, and c
     */
    
    public static double TrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

}
