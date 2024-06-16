package src.symmetric.caesarcipher;

import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalysisDemo {
    // The frequency of each letter in the English language (exclude the whitespace character)
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // The method to do frequency analysis: calculate the relative frequency (occurrences) of every single letter in a given text
    public static Map<Character, Integer> run(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        text = text.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            // Skip the character if it's not in the alphabet
            if (ALPHABET.indexOf(character) == -1) {
                continue;
            }

            // Count the frequency of the character
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }

        return frequencyMap;
    }

    public static void showFrequencies(String text) {
        Map<Character, Integer> frequencyMap = run(text);

        System.out.println("Frequency Analysis:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Test the frequency analysis
        String text = "This is an example of doing the frequency analysis to show the occurrences of each letter in the text, and to detect the most frequent letter in the text.";
        showFrequencies(text);
    }
}
