// Question 6: Implement a method reference in a program to find the square of a number using a static method.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@FunctionalInterface
interface SquareCalculator {
    int findSquare(int number);
}

class MathOperations {
    public static int square(int n) {
        return n * n;
    }
}

public class Q06 {
    public static void main(String[] args) {
        System.out.println("--- Section 2: Interfaces & Method References ---");
        System.out.println("--- Q6: Static Method Reference for Square Calculation ---\n");

        SquareCalculator calculator = MathOperations::square;

        int num = 14;
        int result = calculator.findSquare(num);
        System.out.println("Input Number : " + num);
        System.out.println("Square Result (via SquareCalculator) : " + result);

        Function<Integer, Integer> squareFunction = MathOperations::square;
        int anotherNum = 19;
        System.out.println("\nInput Number : " + anotherNum);
        System.out.println("Square Result (via Function<Integer, Integer>) : " + squareFunction.apply(anotherNum));

        System.out.println("\n--- Calculating Squares for a List of Numbers ---");
        List<Integer> numbers = Arrays.asList(4, 8, 12, 15, 20, 25);
        System.out.println("Original Numbers: " + numbers);

        System.out.print("Squared Numbers : ");
        numbers.stream()
               .map(MathOperations::square)
               .forEach(sq -> System.out.print(sq + " "));
        System.out.println();

        System.out.println();
        System.out.println("Module 2 Assignment - Akshat Bisht");
    }
}
