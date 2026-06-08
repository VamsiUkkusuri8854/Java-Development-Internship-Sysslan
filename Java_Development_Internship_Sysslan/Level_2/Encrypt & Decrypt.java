import java.io.*;
import java.util.Scanner;
 class FileEncryptionTool {
    public static String encrypt(String text) {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : text.toCharArray()) {
            encrypted.append((char) (ch + 3));
        }
        return encrypted.toString();
    }
    public static String decrypt(String text) {
        StringBuilder decrypted = new StringBuilder();
        for (char ch : text.toCharArray()) {
            decrypted.append((char) (ch - 3));
        }
        return decrypted.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Enter Text: ");
            String originalText = sc.nextLine();

            String encryptedText = encrypt(originalText);

            FileWriter writer =
                    new FileWriter("encrypted.txt");

            writer.write(encryptedText);
            writer.close();

            System.out.println("\nEncrypted Text Saved!");

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("encrypted.txt"));

            String storedText = reader.readLine();
            reader.close();

            System.out.println("Encrypted Content: "
                    + storedText);

            System.out.println("Decrypted Content: "
                    + decrypt(storedText));

        } catch (IOException e) {

            System.out.println("Error: "
                    + e.getMessage());
        }

        sc.close();
    }
}