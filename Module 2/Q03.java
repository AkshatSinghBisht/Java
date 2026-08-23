// Question 3: Write a program to import classes from java.util and use ArrayList to store and display a list of integers.

import java.util.ArrayList;
import java.util.List;

public class Q03 {
    public static void main(String[] args) {
        System.out.println("--- Section 1: Packages ---");
        System.out.println("--- Q3: ArrayList from java.util Package Demo ---\n");

        List<Integer> numbers = new ArrayList<>();

        numbers.add(14);
        numbers.add(28);
        numbers.add(45);
        numbers.add(62);
        numbers.add(83);

        System.out.println("Initial List of Integers: " + numbers);
        System.out.println("Total elements in list   : " + numbers.size());

        System.out.print("\nIterating through list elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\n--- Performing List Operations ---");
        System.out.println("Element at index 2 (0-indexed): " + numbers.get(2));

        numbers.add(2, 50);
        System.out.println("After inserting 50 at index 2: " + numbers);

        int removed = numbers.remove(0);
        System.out.println("Removed element at index 0: " + removed);
        System.out.println("Updated List: " + numbers);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all integers in the list: " + sum);

        System.out.println();
        System.out.println("Module 2 Assignment - Akshat Bisht");
    }
}
