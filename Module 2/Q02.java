// Question 2: Define a package shapes that contains an interface Shape with methods area() and perimeter(). Implement this interface in classes Circle and Rectangle within the same package. Demonstrate their usage in a separate class.

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class Q02 {
    public static void main(String[] args) {
        System.out.println("--- Section 1: Packages & Interfaces ---");
        System.out.println("--- Q2: Package 'shapes' Interface & Implementations Demo ---\n");

        // Interface reference holding a Circle object (Polymorphism)
        Shape circle = new Circle(12.5);
        System.out.println("1. Shape: Circle");
        System.out.println("   Radius    : 12.5 units");
        System.out.printf("   Area      : %.2f sq. units%n", circle.area());
        System.out.printf("   Perimeter : %.2f units%n", circle.perimeter());

        System.out.println();

        // Interface reference holding a Rectangle object (Polymorphism)
        Shape rectangle = new Rectangle(15.0, 8.5);
        System.out.println("2. Shape: Rectangle");
        System.out.println("   Length    : 15.0 units");
        System.out.println("   Width     : 8.5 units");
        System.out.printf("   Area      : %.2f sq. units%n", rectangle.area());
        System.out.printf("   Perimeter : %.2f units%n", rectangle.perimeter());

        System.out.println();
        System.out.println("Module 2 Assignment - Akshat Bisht");
    }
}
