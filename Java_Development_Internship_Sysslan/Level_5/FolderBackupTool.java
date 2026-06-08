package Level_5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FolderBackupTool {

    public static void main(String[] args) {

        File sourceFolder = new File("SourceFolder");
        File backupFolder = new File("BackupFolder");
        backupFolder.mkdir();
        File[] files = sourceFolder.listFiles();
        if (files != null) {
            for (File file : files) {
                try {
                    FileInputStream fis =
                            new FileInputStream(file);
                    FileOutputStream fos =
                            new FileOutputStream(
                                    new File(backupFolder,
                                            file.getName()));
                    byte[] data = new byte[1024];
                    int count;
                    while ((count = fis.read(data)) != -1) {
                        fos.write(data, 0, count);
                    }
                    fis.close();
                    fos.close();

                } catch (Exception e) {

                    System.out.println("Error: "
                            + e.getMessage());
                }
            }
        }

        System.out.println("Backup Completed Successfully!");
    }
}