// Question 46: Create a program to show run-time polymorphism using dynamic method dispatch.

class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing general payment of $" + amount);
    }
}

class CreditCardPayment extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount + " with 2% processing fee.");
    }
}

class UPDPayment extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount + " instantly via UPI ID.");
    }
}

public class Q46 {
    public static void main(String[] args) {
        System.out.println("--- Dynamic Method Dispatch (Runtime Polymorphism) Demo ---");

        PaymentMethod payment; // Parent class reference

        payment = new CreditCardPayment();
        payment.processPayment(350.00); // Calls CreditCardPayment's method at runtime

        payment = new UPDPayment();
        payment.processPayment(67.00); // Calls UPDPayment's method at runtime
    }
}
