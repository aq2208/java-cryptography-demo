package src.symmetric.caesarcipher;

public class CaesarCipher {
    // There are 26 letters in the English alphabet (and one whitespace character)
    private static final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

    public static String encrypt(String plainText, int key) {
        String cipherText = "";

        // Make the algorithm case-insensitive
        plainText = plainText.toUpperCase();

        // Loop through each character in the plain text
        for (int i = 0; i < plainText.length(); i++) {
            char character = plainText.charAt(i);

            // find the numeric representation of the character in the alphabet
            int charIndex = ALPHABET.indexOf(character);

            // Shift the character by the key
            int encryptedIndex = Math.floorMod(charIndex + key, ALPHABET.length());

            // Append the encrypted character to the cipher text
            cipherText += ALPHABET.charAt(encryptedIndex);
        }

        return cipherText;
    }

    public static String decrypt(String cipherText, int key) {
        String plainText = "";

        // Make the algorithm case-insensitive
        cipherText = cipherText.toUpperCase();

        // Loop through each character in the plain text
        for (int i = 0; i < cipherText.length(); i++) {
            char character = cipherText.charAt(i);

            // find the numeric representation of the character in the alphabet
            int charIndex = ALPHABET.indexOf(character);

            // Shift the character by the key inversely
            int decryptedIndex = Math.floorMod(charIndex - key, ALPHABET.length());

            // Append the encrypted character to the plain text
            plainText += ALPHABET.charAt(decryptedIndex);
        }

        return plainText;
    }
}
