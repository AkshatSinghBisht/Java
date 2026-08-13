// Question 25: Write a program to find the sum of all elements in an array.

public class Q25 {
    public static void main(String[] args) {
        int[] arr = {15, 27, 42, 67, 84};

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println("--- Sum of Array Elements ---");
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum = " + sum);
    }
}
