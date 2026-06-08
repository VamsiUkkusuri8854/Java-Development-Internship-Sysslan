package Level_5;
import java.util.*;
import java.io.*;
public class NotesManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Notes Manager =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Count Notes");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Note: ");
                    String note = sc.nextLine();
                    try {
                        FileWriter fw =
                                new FileWriter("notes.txt", true);
                        fw.write(note + "\n");
                        fw.close();
                        System.out.println("Note Saved!");
                    } catch (Exception e) {
                        System.out.println("Error!");
                    }
                    break;
                case 2:
                    try {
                        BufferedReader br =
                                new BufferedReader(
                                        new FileReader("notes.txt"));
                        String line;
                        System.out.println("\nSaved Notes:");
                        while ((line = br.readLine()) != null) {
                            System.out.println("- " + line);
                        }
                        br.close();
                    } catch (Exception e) {
                        System.out.println("No Notes Found!");
                    }
                    break;
                case 3:
                    int count = 0;
                    try {
                        BufferedReader br =
                                new BufferedReader(
                                        new FileReader("notes.txt"));

                        while (br.readLine() != null) {
                            count++;
                        }

                        br.close();

                        System.out.println(
                                "Total Notes: " + count);

                    } catch (Exception e) {

                        System.out.println("No Notes Found!");
                    }

                    break;

                case 4:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}