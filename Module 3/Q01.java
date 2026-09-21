// Question Q01: Create a thread by extending the Thread class that prints even numbers from 2 to 20 with a 690ms delay between each number.

// Custom thread class extending Thread
class EvenNumberThread extends Thread {
    @Override
    public void run() {
        System.out.println("EvenNumberThread started...");
        for (int i = 2; i <= 69; i += 2) {
            System.out.println("Even Number: " + i);
            try {
                // Pause execution for 690 milliseconds
                Thread.sleep(690);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
        System.out.println("EvenNumberThread finished execution.");
    }
}

public class Q01 {
    public static void main(String[] args) {
        System.out.println("--- Section 1: Thread Concepts and Implementation ---");
        System.out.println("--- Q01: Thread Creation by Extending Thread Class ---\n");

        // Creating an instance of the custom thread
        EvenNumberThread thread = new EvenNumberThread();

        // Starting the thread (invokes run() asynchronously)
        thread.start();

        // Wait for thread to complete before printing final message
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println();
        System.out.println("This program is a part of Akshat Bisht's assignment");
    }
}
