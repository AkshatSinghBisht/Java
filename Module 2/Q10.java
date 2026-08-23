// Question 10: Demonstrate the use of throw and throws keywords in a program that calculates the factorial of a number. Throw an exception if the input number is negative.

public class Q10 {

    public static long calculateFactorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial of a negative number: " + n);
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("--- Section 3: Errors and Exceptions ---");
        System.out.println("--- Q10: Demonstration of 'throw' and 'throws' with Factorial ---\n");

        int[] sampleInputs = {6, 0, 8, -5, 9, -2};

        for (int num : sampleInputs) {
            System.out.print("Calculating factorial for n = " + num + ": ");
            try {
                long result = calculateFactorial(num);
                System.out.println("Result = " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("\n  [CAUGHT EXCEPTION via 'throw'] " + e.getMessage());
            }
            System.out.println("------------------------------------------------------------------");
        }

        System.out.println();
        System.out.println("Module 2 Assignment - Akshat Bisht");
    }
}
