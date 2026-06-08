package Level_5;
import java.util.*;
import java.io.*;
public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Inventory Management =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    try {
                        FileWriter fw =
                                new FileWriter("inventory.csv", true);
                        fw.write(name + ","
                                + quantity + ","
                                + price + "\n");
                        fw.close();
                        System.out.println("Product Added!");
                    } catch (Exception e) {
                        System.out.println("Error!");
                    }
                    break;
                case 2:
                    try {
                        BufferedReader br =
                                new BufferedReader(
                                        new FileReader("inventory.csv"));
                        String line;
                        System.out.println("\nProducts:");
                        while ((line = br.readLine()) != null) {
                            String[] data = line.split(",");
                            System.out.println(
                                    "Name : " + data[0] +
                                    " | Qty : " + data[1] +
                                    " | Price : " + data[2]);
                        }

                        br.close();

                    } catch (Exception e) {

                        System.out.println("No Products Found!");
                    }

                    break;

                case 3:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}