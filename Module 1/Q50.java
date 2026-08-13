// Question 50: Create a program to check if a given string is a palindrome.

public class Q50 {

    public static boolean checkPalindrome(String str) {
        if (str == null) return false;

        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String test1 = "radar";
        String test2 = "Akshat Bisht";

        System.out.println("--- String Palindrome Checker ---");
        System.out.println("\"" + test1 + "\" -> Palindrome? " + checkPalindrome(test1));
        System.out.println("\"" + test2 + "\" -> Palindrome? " + checkPalindrome(test2));
    }
}
