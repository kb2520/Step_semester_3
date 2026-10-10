package main.java.week1.assigment_problems;

public class Q2 {

    public static void checkTypingAccuracy(String original, String typed) {
        int totalChars = original.length();
        int matchedCount = 0;
        int firstMismatchPos = -1;
        char origMismatchChar = ' ';
        char typedMismatchChar = ' ';

        for (int i = 0; i < totalChars; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchedCount++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1; // 1-based position indexing
                origMismatchChar = original.charAt(i);
                typedMismatchChar = typed.charAt(i);
            }
        }

        double accuracy = ((double) matchedCount / totalChars) * 100;

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | ", matchedCount, totalChars, accuracy);

        if (firstMismatchPos == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.printf("First Mismatch at position %d ('%c' vs '%c')\n",
                    firstMismatchPos, origMismatchChar, typedMismatchChar);
        }
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }
}
