package Level_4;
import java.io.*;
public class CSVDataProcessor {
    public static void main(String[] args) {
        int count = 0;
        int totalMarks = 0;
        int highestMarks = 0;
        String topper = "";
        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("students.csv"));

            String line;

            br.readLine(); // Skip Header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int marks = Integer.parseInt(data[1]);

                count++;
                totalMarks += marks;

                if (marks > highestMarks) {
                    highestMarks = marks;
                    topper = name;
                }
            }

            br.close();

            double average =
                    (double) totalMarks / count;

            System.out.println("\n===== CSV Report =====");
            System.out.println("Total Students : " + count);
            System.out.println("Average Marks  : " + average);
            System.out.println("Topper         : " + topper);
            System.out.println("Highest Marks  : " + highestMarks);
        } catch (Exception e) {
            System.out.println("File Error!");
        }
    }
}