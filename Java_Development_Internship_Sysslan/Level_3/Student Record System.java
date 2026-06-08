package Level_3;

import java.io.*;
import java.util.Scanner;
class Student {
    int id;
    String name;
    double marks;
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
 class StudentRecordSystem {
    private static final String FILE_NAME = "students.txt";
    public static void addStudent(Student student) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(student.id + ","
                    + student.name + ","
                    + student.marks + "\n");
            System.out.println("Student Record Saved Successfully!");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void viewStudents() {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n===== Student Records =====");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                System.out.println("ID    : " + data[0]);
                System.out.println("Name  : " + data[1]);
                System.out.println("Marks : " + data[2]);
                System.out.println("------------------------");
            }

        } catch (IOException e) {

            System.out.println("No Records Found!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student student =
                            new Student(id, name, marks);

                    addStudent(student);

                    break;

                case 2:

                    viewStudents();
                    break;

                case 3:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}