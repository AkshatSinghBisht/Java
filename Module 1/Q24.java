// Question 24: Write a program to check whether a given number is prime.

public class Q24 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int testNumber1 = 47;
        int testNumber2 = 68;

        System.out.println("--- Prime Number Check ---");
        System.out.println(testNumber1 + " is Prime? " + isPrime(testNumber1));
        System.out.println(testNumber2 + " is Prime? " + isPrime(testNumber2));
    }
}
