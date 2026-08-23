// Question 1: Create a Java package utilities that contains a class MathUtils with a method add(int a, int b) to return the sum of two numbers. Demonstrate the use of this package in another class.

import utilities.MathUtils;

public class Q01 {
    public static void main(String[] args) {
        System.out.println("--- Section 1: Packages ---");
        System.out.println("--- Q1: Custom Package 'utilities' Demo ---");

        int num1 = 64;
        int num2 = 28;

        // Calling the static method add() from the imported MathUtils class
        int result = MathUtils.add(num1, num2);

        System.out.println("First Number  : " + num1);
        System.out.println("Second Number : " + num2);
        System.out.println("Sum (using utilities.MathUtils.add) : " + result);

        // Additional demonstration with negative values
        int num3 = -35;
        int num4 = 42;
        System.out.println("\nAdditional Test:");
        System.out.println(num3 + " + " + num4 + " = " + MathUtils.add(num3, num4));

        System.out.println();
        System.out.println("Module 2 Assignment - Akshat Bisht");
    }
}
