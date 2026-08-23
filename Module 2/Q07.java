// Question 7: Write a program that demonstrates the difference between try-catch and try-catch-finally blocks by dividing two numbers and handling ArithmeticException.

public class Q07 {

    public static void demonstrateTryCatch(int numerator, int denominator) {
        System.out.println("Executing divide(" + numerator + ", " + denominator + ") with try-catch:");
        try {
            int result = numerator / denominator;
            System.out.println("  [try block] Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("  [catch block] ArithmeticException caught: " + e.getMessage());
        }
        System.out.println("  [after block] Code execution resumes after try-catch.");
    }

    public static void demonstrateTryCatchFinally(int numerator, int denominator) {
        System.out.println("Executing divide(" + numerator + ", " + denominator + ") with try-catch-finally:");
        try {
            int result = numerator / denominator;
            System.out.println("  [try block] Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("  [catch block] ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("  [finally block] This block ALWAYS executes for cleanup / guarantees.");
        }
        System.out.println("  [after block] Code execution resumes after try-catch-finally.");
    }

    public static void main(String[] args) {
        System.out.println("--- Section 3: Errors and Exceptions ---");
        System.out.println("--- Q7: Difference Between try-catch and try-catch-finally ---\n");

        System.out.println("==================================================");
        System.out.println("PART 1: Demonstrating try-catch block");
        System.out.println("==================================================");
        
        System.out.println("Case 1A: Valid Division (84 / 7)");
        demonstrateTryCatch(84, 7);
        System.out.println();

        System.out.println("Case 1B: Division by Zero (84 / 0)");
        demonstrateTryCatch(84, 0);
        System.out.println();

        System.out.println("==================================================");
        System.out.println("PART 2: Demonstrating try-catch-finally block");
        System.out.println("==================================================");

        System.out.println("Case 2A: Valid Division (96 / 8)");
        demonstrateTryCatchFinally(96, 8);
        System.out.println();

        System.out.println("Case 2B: Division by Zero (96 / 0)");
        demonstrateTryCatchFinally(96, 0);

        System.out.println();
        System.out.println("Module 2 Assignment - Akshat Bisht");
    }
}
