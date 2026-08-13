// Question 28: Create a program to sort an array using the bubble sort algorithm.

public class Q28 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Optimization: stop if array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {67, 29, 84, 15, 42, 73, 91};

        System.out.println("--- Bubble Sort Demo ---");
        System.out.print("Unsorted Array: ");
        printArray(data);

        bubbleSort(data);

        System.out.print("Sorted Array:   ");
        printArray(data);
    }
}
