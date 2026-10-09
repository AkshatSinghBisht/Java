// Question: Write a program to demonstrate the use of TreeMap for sorting keys.

import java.util.Map;
import java.util.TreeMap;

public class Q17_TreeMapSortedKeys {
    public static void main(String[] args) {
        System.out.println("--- Section 5: Map Interface ---");
        System.out.println("--- Q17: TreeMap for Natural Sorting of Keys ---\n");

        // TreeMap automatically sorts entries based on the natural ordering of keys
        Map<Integer, String> employeeDirectory = new TreeMap<>();

        // Inserting unsorted keys
        employeeDirectory.put(169, "Faizan");
        employeeDirectory.put(69, "Akshat Bisht");
        employeeDirectory.put(196, "Hamza");
        employeeDirectory.put(96, "Zaid");
        employeeDirectory.put(142, "Bilal");

        System.out.println("Inserted Key Sequence: 169, 69, 196, 96, 142");
        System.out.println("\nTreeMap Sorted Key-Value Pairs (Ascending Order of ID):");
        for (Map.Entry<Integer, String> entry : employeeDirectory.entrySet()) {
            System.out.println("  ID: " + entry.getKey() + " -> Employee Name: " + entry.getValue());
        }

        System.out.println();
        System.out.println("This program is a part of Akshat Bisht's assignment");
    }
}
