package src.symmetric.caesarcipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);

        // Test the Caesar Cipher Encryption
        System.out.println("Enter the plain text: ");
        String plainText = myObj.nextLine();

        System.out.println("Enter the key: ");
        int key = myObj.nextInt();

        System.out.println("Caesar Cipher Encryption: " + CaesarCipher.encrypt(plainText, key));

        // Test the Caesar Cipher Decryption
        System.out.println("Enter the cipher text: ");
        String cipherText = myObj2.nextLine();

        System.out.println("Caesar Cipher Encryption: " + CaesarCipher.decrypt(cipherText, key));
    }
}
