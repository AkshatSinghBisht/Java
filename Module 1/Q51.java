// Question 51: Implement a program to split a string into words and print each word on a new line.

public class Q51 {

    public static void splitAndPrintWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("String is empty.");
            return;
        }

        // Split by one or more whitespace characters
        String[] words = sentence.trim().split("\\s+");

        System.out.println("Words in the sentence (" + words.length + " total):");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + words[i]);
        }
    }

    public static void main(String[] args) {
        String inputSentence = "Akshat is mastering Java programming language";

        System.out.println("--- Split String into Words Demo ---");
        System.out.println("Input Sentence: \"" + inputSentence + "\"\n");
        splitAndPrintWords(inputSentence);
    }
}
