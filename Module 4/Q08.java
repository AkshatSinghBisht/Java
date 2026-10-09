// Question: Write a generic method to print all elements of any Collection (e.g., List, Set, Queue).

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Q08 {

    /**
     * Generic method using wildcards to print elements of any Collection type.
     *
     * @param collection any implementation of Collection<?>
     * @param collectionName descriptive label
     */
    public static void printCollection(Collection<?> collection, String collectionName) {
        System.out.println("Collection [" + collectionName + "] (Size: " + collection.size() + "):");
        System.out.print("  Elements: [ ");
        for (Object element : collection) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("--- Section 2: Collection Framework ---");
        System.out.println("--- Q08: Generic Collection Printer ---\n");

        // 1. Printing a List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        printCollection(list, "List<String>");

        // 2. Printing a Set
        Set<Integer> set = new HashSet<>();
        set.add(169);
        set.add(296);
        set.add(369);
        printCollection(set, "Set<Integer>");

        // 3. Printing a Queue
        Queue<Double> queue = new ArrayDeque<>();
        queue.add(6.9);
        queue.add(9.6);
        queue.add(69.96);
        printCollection(queue, "Queue<Double>");

        System.out.println();
        System.out.println("This program is a part of Akshat Bisht's assignment");
    }
}
