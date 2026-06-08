package Level_4;

import java.util.*;
import java.io.*;

public class DailyTaskManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Daily Task Manager =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Save Tasks");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Task: ");
                    String task = sc.nextLine();

                    tasks.add(task);

                    System.out.println("Task Added!");
                    break;

                case 2:

                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Available!");
                    } else {

                        System.out.println("\nTasks:");

                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }

                    break;

                case 3:

                    try {

                        FileWriter fw =
                                new FileWriter("tasks.txt");

                        for (String t : tasks) {
                            fw.write(t + "\n");
                        }

                        fw.close();

                        System.out.println("Tasks Saved!");

                    } catch (Exception e) {

                        System.out.println("Error!");
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