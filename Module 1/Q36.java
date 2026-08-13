// Question 36: Write a program to demonstrate operator precedence in Java.

public class Q36 {
    public static void main(String[] args) {
        System.out.println("--- Operator Precedence Demo ---");

        int a = 14;
        int b = 5;
        int c = 2;

        // Multiplication (*) has higher precedence than Addition (+)
        int res1 = a + b * c; // 14 + (5 * 2) = 28
        System.out.println("Expression (a + b * c) = " + res1);

        // Parentheses () override default precedence
        int res2 = (a + b) * c; // (14 + 5) * 2 = 42
        System.out.println("Expression ((a + b) * c) = " + res2);

        // Division (/) and Multiplication (*) have same precedence, evaluated left to right
        int res3 = a / b * c; // (14 / 5) * 2 = 4
        System.out.println("Expression (a / b * c) = " + res3);

        // Relational operators (<, >) evaluated before Logical operators (&&)
        boolean res4 = a > b && b > c; // (14 > 5) && (5 > 2) -> true && true -> true
        System.out.println("Expression (a > b && b > c) = " + res4);
    }
}
