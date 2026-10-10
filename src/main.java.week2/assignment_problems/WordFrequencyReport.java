package main.java.week2.assignment_problems;

import java.util.*;

public class WordFrequencyReport {

    public static void printFilteredWordFrequency(String feedback) {
        if (feedback == null || feedback.trim().isEmpty()) {
            return;
        }

        // Stop words set
        Set<String> stopWords = new HashSet<>(Arrays.asList("the", "was", "and", "a", "is", "of", "in"));

        // Normalize text: lowercase and strip punctuation (periods and commas)
        String cleanedText = feedback.toLowerCase().replace(".", "").replace(",", "");

        // Split by whitespace
        String[] words = cleanedText.split("\\s+");

        // Map to store frequency of valid words
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty() || stopWords.contains(word)) {
                continue;
            }
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Transfer map entries to a list for sorting
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        // Sort entries by count in descending order
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Print frequency report
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String feedback = "The mentor was great, the session was great and clear.";
        printFilteredWordFrequency(feedback);
    }
}
