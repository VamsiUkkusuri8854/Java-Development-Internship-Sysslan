package Level_3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LogFileGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Log Message: ");
            String message = sc.nextLine();

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String timeStamp =
                    LocalDateTime.now().format(formatter);

            FileWriter writer =
                    new FileWriter("application_log.txt", true);

            writer.write("[" + timeStamp + "] "
                    + message + "\n");

            writer.close();

            System.out.println("Log Saved Successfully!");

        } catch (IOException e) {

            System.out.println("Error: "
                    + e.getMessage());
        }

        sc.close();
    }
}