package src.symmetric.caesarcipher;

import java.util.Map;

public class FrequencyAnalysisCracker {
    // The frequency of each letter in the English language (exclude the whitespace character)
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void crack(String cipherText) {
        // Calculate the frequency of each letter in the cipher text
        Map<Character, Integer> frequencyMap = FrequencyAnalysisDemo.run(cipherText);

        // Find the most frequent letter in the cipher text
        Map.Entry<Character, Integer> maxEntry = frequencyMap.entrySet().iterator().next();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        // Make a guess about the Caesar Cipher's key
        char mostFrequentLetter = maxEntry.getKey();
        // formula: key = (index of the most frequent letter - index of the most frequent letter in English)
        int key = ALPHABET.indexOf(mostFrequentLetter) - ALPHABET.indexOf('E');
        System.out.println("The key is: " + key);
    }
}
