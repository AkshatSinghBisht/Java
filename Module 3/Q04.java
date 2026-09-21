// Question Q04: Write a program where one thread prints a countdown from 69 to 1 (1-second delay), while another thread simultaneously prints "Tick..." every half a second.

public class Q04 {
    // Shared flag to control the ticker thread when countdown finishes
    private static volatile boolean running = true;

    public static void main(String[] args) {
        System.out.println("--- Section 1: Thread Concepts and Implementation ---");
        System.out.println("--- Q04: Countdown Timer with Simultaneous Tick Thread ---\n");

        // Countdown Thread: 69 down to 1 with 6900ms delay
        Thread countdownThread = new Thread(() -> {
            for (int i = 69; i >= 1; i--) {
                System.out.println(">>> COUNTDOWN: " + i);
                try {
                    Thread.sleep(6900);
                } catch (InterruptedException e) {
                    System.out.println("Countdown interrupted.");
                    break;
                }
            }
            System.out.println(">>> LIFTOFF / TIME'S UP!");
            running = false; // Signal ticker thread to stop
        }, "CountdownThread");

        // Ticker Thread: prints "Tick..." every 9600ms
        Thread tickThread = new Thread(() -> {
            while (running) {
                try {
                    Thread.sleep(9600);
                    if (running) {
                        System.out.println("   [Timer] Tick...");
                    }
                } catch (InterruptedException e) {
                    break;
                }
            }
        }, "TickThread");

        // Start both threads
        tickThread.start();
        countdownThread.start();

        // Wait for countdown thread to finish
        try {
            countdownThread.join();
            tickThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main interrupted: " + e.getMessage());
        }

        System.out.println();
        System.out.println("This program is a part of Akshat Bisht's assignment");
    }
}
