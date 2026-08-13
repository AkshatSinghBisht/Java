// Question 22: Write a program to check if a given string or number is a palindrome.

public class Q22 {

    // Method to check if a number is palindrome
    public static boolean isNumberPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    // Method to check if a string is palindrome
    public static boolean isStringPalindrome(String str) {
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("--- Palindrome Check Demo ---");

        // Checking number palindrome
        int num1 = 45654;
        int num2 = 67890;
        System.out.println("Number " + num1 + " is Palindrome? " + isNumberPalindrome(num1));
        System.out.println("Number " + num2 + " is Palindrome? " + isNumberPalindrome(num2));

        // Checking string palindrome
        String str1 = "radar";
        String str2 = "akshat";
        System.out.println("String \"" + str1 + "\" is Palindrome? " + isStringPalindrome(str1));
        System.out.println("String \"" + str2 + "\" is Palindrome? " + isStringPalindrome(str2));
    }
}
