//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package Functions;

import java.util.Scanner;

public class CircumferenceArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        float radius = in.nextFloat();
        AreaofCircle(radius);
        CircumferenceofCircle(radius);
    }

    static double AreaofCircle(float r){
        double area;
        area = 3.14*(r*r);
        System.out.println("Area of the Circle is: "+area);
        return area;
    }


    static double CircumferenceofCircle(float r){
        double circumference;
        circumference = 2*3.14*r;
        System.out.println("Circumference of the Circle is: "+circumference);
        return circumference;
    }



}
