// Question 5: Write a Java program to sort a list of strings in descending order using a lambda expression.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
        System.out.println("--- Section 2: Interfaces & Lambda Expressions ---");
        System.out.println("--- Q5: Sort List of Strings in Descending Order ---\n");

        List<String> programmingLanguages = new ArrayList<>(
            Arrays.asList("Java", "Python", "C++", "JavaScript", "Rust", "Go", "Kotlin")
        );

        System.out.println("Original List:");
        System.out.println(programmingLanguages);

        Collections.sort(programmingLanguages, (s1, s2) -> s2.compareTo(s1));

        System.out.println("\nSorted List (Descending Order via Lambda):");
        System.out.println(programmingLanguages);

        List<String> names = new ArrayList<>(
            Arrays.asList("Akshat Bisht", "Ayush", "Krrish", "Utkarsh", "Karthik", "Ram")
        );

        System.out.println("\nStudent Names (Original):");
        System.out.println(names);

        names.sort((a, b) -> b.compareToIgnoreCase(a));

        System.out.println("Student Names (Sorted Descending):");
        System.out.println(names);

        System.out.println();
        System.out.println("Module 2 Assignment - Akshat Bisht");
    }
}
