package src.symmetric.caesarcipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);

        // Test the Caesar Cipher Encryption
        System.out.println("=================================");
        System.out.println("Enter the plain text: ");
        String plainText = myObj.nextLine();

        System.out.println("Enter the key: ");
        int encryptedKey = myObj.nextInt();

        System.out.println("Caesar Cipher Encryption: " + CaesarCipher.encrypt(plainText, encryptedKey));

        // Test the Caesar Cipher Decryption
        System.out.println("=================================");
        System.out.println("Enter the cipher text: ");
        String cipherText = myObj2.nextLine();

        System.out.println("Enter the key: ");
        int decryptedKey = myObj.nextInt();

        System.out.println("Caesar Cipher Encryption: " + CaesarCipher.decrypt(cipherText, decryptedKey));

        // Test the Caesar Cipher Brute Force Cracker
        System.out.println("=================================");
        System.out.println("Enter the cipher text to crack using brute-force: ");
        String cipherTextToCrack = myObj2.nextLine();

        BruteForceCracker.crack(cipherTextToCrack);

        // Test the Caesar Cipher Frequency Analysis Cracker
        System.out.println("=================================");
        System.out.println("Enter the cipher text to crack using frequency analysis: ");
        String cipherTextToCrack2 = myObj2.nextLine();

        FrequencyAnalysisCracker.crack(cipherTextToCrack2);
    }
}
