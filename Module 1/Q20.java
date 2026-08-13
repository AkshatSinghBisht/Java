// Question 20: Write a program to find the largest of three numbers entered by the user.

public class Q20 {

    public static int findLargest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        int a = 67;
        int b = 92;
        int c = 34;

        System.out.println("--- Largest of Three Numbers ---");
        System.out.println("Numbers: " + a + ", " + b + ", " + c);

        int largest = findLargest(a, b, c);
        System.out.println("The largest number is: " + largest);
    }
}
