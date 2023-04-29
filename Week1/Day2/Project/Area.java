/*
 * This program calculates the area of the rectangle.
 */

package Week1.Day2.Project;

public class Area{
    public static void area(int length){
        System.out.println("The area of square is " + (length * length));
    }

    public static void area(int length, int width){
        System.out.println("The are of rectangle is " + (length * width));
    }

    public static void area(double radius){
        System.out.println("The area of circle is " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        area(15); // 225
        area(10,15); // 150
        area(2.124); // 14.16572064...

    }
}