// Question 4: Write a program to demonstrate method overloading and method overriding.

// Parent Class
class Display {
    // Method Overloading (Compile-time polymorphism): Same method name, different parameters
    public void show(int number) {
        System.out.println("Overloaded Method - Integer parameter: " + number);
    }

    public void show(String text) {
        System.out.println("Overloaded Method - String parameter: " + text);
    }

    // Method to be overridden
    public void printMessage() {
        System.out.println("Parent Display message.");
    }
}

// Child Class
class CustomDisplay extends Display {
    // Method Overriding (Run-time polymorphism): Same method signature in child class
    @Override
    public void printMessage() {
        System.out.println("Child CustomDisplay message (Overridden).");
    }
}

public class Q04 {
    public static void main(String[] args) {
        System.out.println("--- Method Overloading Demo ---");
        Display d = new Display();
        d.show(100);
        d.show("Hello Java!");

        System.out.println("\n--- Method Overriding Demo ---");
        Display cd = new CustomDisplay();
        cd.printMessage();
    }
}
