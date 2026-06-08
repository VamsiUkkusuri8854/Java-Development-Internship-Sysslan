import java.util.Random;
import java.util.Scanner;
 class SecurePasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "@#$%&*!?";
        String allCharacters = upperCase + lowerCase + numbers + symbols;
        System.out.print("Enter password length: ");
        int length = sc.nextInt();
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(index));
        }
        System.out.println("\nGenerated Password:");
        System.out.println(password);
        sc.close();
    }
}