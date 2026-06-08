package Level_4;

import java.io.*;

public class FileOrganizer {

    public static void main(String[] args) {

        File sourceFolder = new File("Files");

        File imageFolder = new File("Images");
        File documentFolder = new File("Documents");

        imageFolder.mkdir();
        documentFolder.mkdir();

        File[] files = sourceFolder.listFiles();

        if (files != null) {

            for (File file : files) {

                String fileName = file.getName().toLowerCase();

                if (fileName.endsWith(".jpg") ||
                    fileName.endsWith(".png")) {

                    file.renameTo(
                        new File(imageFolder, file.getName()));

                } else if (fileName.endsWith(".pdf") ||
                           fileName.endsWith(".txt")) {

                    file.renameTo(
                        new File(documentFolder, file.getName()));
                }
            }
        }

        System.out.println("Files Organized Successfully!");
    }
}