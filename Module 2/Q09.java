// Question 9: Create a custom exception InvalidAgeException that is thrown when a user's age is less than 18. Handle the exception and log the error to a file using java.util.logging.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Q09 {

    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    private static final Logger logger = Logger.getLogger(Q09.class.getName());
    private static final String LOG_FILE_NAME = "age_validation_error.log";

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Validation Failed: Age " + age + " is strictly less than 18.");
        }
        System.out.println("Status: Age " + age + " is valid. User registered successfully.");
    }

    public static void main(String[] args) {
        System.out.println("--- Section 3: Errors and Exceptions ---");
        System.out.println("--- Q9: Custom Exception with java.util.logging File Logging ---\n");

        FileHandler fileHandler = null;

        try {
            logger.setUseParentHandlers(false);

            fileHandler = new FileHandler(LOG_FILE_NAME, false);
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.ALL);

            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);

            System.out.println("[Configuration] Logger initialized. Target log file: " + LOG_FILE_NAME);
            System.out.println("==================================================");

            int validAge = 28;
            System.out.println("Attempt 1: Registering with Age " + validAge);
            try {
                checkAge(validAge);
                logger.info("Registration successful for user with age: " + validAge);
            } catch (InvalidAgeException e) {
                logger.log(Level.SEVERE, "Exception during registration: " + e.getMessage(), e);
            }

            System.out.println("--------------------------------------------------");

            int invalidAge = 14;
            System.out.println("Attempt 2: Registering with Age " + invalidAge);
            try {
                checkAge(invalidAge);
                logger.info("Registration successful for user with age: " + validAge);
            } catch (InvalidAgeException e) {
                System.out.println("Status: [CAUGHT InvalidAgeException] " + e.getMessage());
                logger.log(Level.SEVERE, "Underage attempt detected with age " + invalidAge + ": " + e.getMessage(), e);
                System.out.println("Action: Error details and stack trace have been logged to '" + LOG_FILE_NAME + "'");
            }

            System.out.println("==================================================");

        } catch (IOException e) {
            System.err.println("Failed to initialize file logger: " + e.getMessage());
        } finally {
            if (fileHandler != null) {
                fileHandler.close();
            }
        }

        System.out.println("\n--- Verification: Contents of '" + LOG_FILE_NAME + "' ---");
        File logFile = new File(LOG_FILE_NAME);
        if (logFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("  " + line);
                }
            } catch (IOException e) {
                System.err.println("Could not read log file: " + e.getMessage());
            }
        }

        System.out.println();
        System.out.println("Module 2 Assignment - Akshat Bisht");
    }
}
