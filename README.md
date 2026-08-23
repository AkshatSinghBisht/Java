# Java Assignments Repository - Akshat Bisht

This repository contains complete Java assignment solutions for **Module 1** and **Module 2**.

---

## 📁 Repository Structure

- **`Module 1/`**: Java Assignment 1 programs (`Q01.java` to `Q51.java`).
- **`Module 2/`**: Java Assignment 2 programs (`Q01.java` to `Q10.java` along with `shapes` and `utilities` packages).

---

## 📚 Module 2 Assignment Index

### Section 1: Defining, Implementing, and Importing Packages
1. **`Module 2/Q01.java`** / **`utilities/MathUtils.java`**: Demonstrates creating and importing custom package `utilities` containing `MathUtils.add(int, int)`.
2. **`Module 2/Q02.java`** / **`shapes/`**: Package `shapes` with interface `Shape` (`area()`, `perimeter()`) implemented by `Circle` and `Rectangle`.
3. **`Module 2/Q03.java`**: Using `ArrayList<Integer>` from `java.util` for dynamic list manipulation and iteration.

### Section 2: Interfaces, Functional Interfaces & Lambda Expressions
4. **`Module 2/Q04.java`**: Custom `@FunctionalInterface Calculator` implemented via Lambda expressions.
5. **`Module 2/Q05.java`**: Sorting strings in descending order using Lambda expressions as custom Comparators.
6. **`Module 2/Q06.java`**: Static Method References (`MathOperations::square`) and Java Stream API.

### Section 3: Errors and Exceptions
7. **`Module 2/Q07.java`**: Demonstrating `try-catch` vs `try-catch-finally` blocks handling `ArithmeticException`.
8. **`Module 2/Q08.java`**: Custom user-defined exception `InvalidAgeException` for age validation (< 18).
9. **`Module 2/Q09.java`**: Logging custom exception stack traces to file using `java.util.logging`.
10. **`Module 2/Q10.java`**: Demonstration of `throw` and `throws` keywords with Factorial calculations.

---

## ⚙️ How to Compile & Run

### Module 2 Programs
```bash
cd "Module 2"
javac *.java utilities/*.java shapes/*.java
java Q01
java Q02
```

---

## Author
- **Akshat Bisht**
