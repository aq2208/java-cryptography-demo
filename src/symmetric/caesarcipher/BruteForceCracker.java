package src.symmetric.caesarcipher;

public class BruteForceCracker {
    // There are 26 letters in the English alphabet (and one whitespace character)
    private static final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

    public static void crack(String cipherText) {
        // Loop through all possible keys (possible key is within the size of the alphabet)
        // => That's why Caesar Cipher is weak: only 27 possible encryptions
        for (int key = 1; key < ALPHABET.length(); key++) {
            // Decrypt the cipher text using the current key
            String decryptedText = CaesarCipher.decrypt(cipherText, key);

            // Print the decrypted text
            System.out.println("Key: " + key + " | Decrypted Text: " + decryptedText);
        }
    }
}
