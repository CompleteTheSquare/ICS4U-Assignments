/*
Assignment 4 - Anita Yang
This application takes values given in the code then outputs certain values.
 */
package shapes;

//import methods
import static shapes.Rectangle.RectangleArea;
import static shapes.Rectangle.RectanglePerimeter;
import static shapes.Circle.CircleArea;
import static shapes.Circle.Circumference;
import static shapes.Triangle.TriangleArea;
import static shapes.Triangle.TrianglePerimeter;

/**

 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Put your tests here
        System.out.println("Rectangle has area " + RectangleArea(5,10));
        System.out.println("Rectangle has perimeter " + RectanglePerimeter (5, 10));
        System.out.println("Triangle has area " +TriangleArea(5, 10));
        System.out.println("Triangle has perimeter " +TrianglePerimeter(5, 10, 6));
        System.out.println("Circle has area " +CircleArea(5));
        System.out.println("Circle has circumference " +Circumference(5));
    }

}
