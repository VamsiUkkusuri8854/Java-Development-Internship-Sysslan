import java.io.*;
import java.util.Scanner;
 class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "expenses.txt";
        try {
            FileWriter writer = new FileWriter(fileName, true);
            System.out.print("Enter Expense Name: ");
            String expenseName = sc.nextLine();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            writer.write(expenseName + " - ₹" + amount + "\n");
            writer.close();

            System.out.println("\nExpense Saved Successfully!");

            System.out.println("\n===== Expense History =====");

            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}