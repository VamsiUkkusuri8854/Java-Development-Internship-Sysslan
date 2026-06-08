package Level_4;

import java.util.*;

public class StudentReportGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks in Java: ");
        int java = sc.nextInt();

        System.out.print("Enter Marks in DBMS: ");
        int dbms = sc.nextInt();

        System.out.print("Enter Marks in OS: ");
        int os = sc.nextInt();

        int total = java + dbms + os;
        double average = total / 3.0;

        System.out.println("\n==============================");
        System.out.println("      STUDENT REPORT");
        System.out.println("==============================");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("------------------------------");
        System.out.println("Java       : " + java);
        System.out.println("DBMS       : " + dbms);
        System.out.println("OS         : " + os);
        System.out.println("------------------------------");
        System.out.println("Total      : " + total);
        System.out.println("Average    : " + average);

        if (average >= 75) {
            System.out.println("Result     : Distinction");
        } else if (average >= 60) {
            System.out.println("Result     : First Class");
        } else if (average >= 40) {
            System.out.println("Result     : Pass");
        } else {
            System.out.println("Result     : Fail");
        }

        System.out.println("==============================");

        sc.close();
    }
}