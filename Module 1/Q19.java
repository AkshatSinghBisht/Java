// Question 19: Write a program to check if a given number is odd or even.

public class Q19 {

    public static void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an EVEN number.");
        } else {
            System.out.println(number + " is an ODD number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Odd or Even Check ---");

        // Demonstration with sample numbers
        int sampleNumber1 = 67;
        int sampleNumber2 = 50;

        checkOddEven(sampleNumber1);
        checkOddEven(sampleNumber2);
    }
}
