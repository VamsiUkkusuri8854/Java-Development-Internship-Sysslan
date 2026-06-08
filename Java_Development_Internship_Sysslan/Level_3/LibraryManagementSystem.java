package Level_3;

import java.util.ArrayList;
import java.util.Scanner;

class Book {

    int bookId;
    String title;
    boolean isIssued;

    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isIssued = false;
    }

    void displayBook() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Status  : " + (isIssued ? "Issued" : "Available"));
        System.out.println("----------------------------");
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    books.add(new Book(id, title));

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:

                    if (books.isEmpty()) {
                        System.out.println("No Books Available!");
                    } else {
                        for (Book b : books) {
                            b.displayBook();
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Book ID To Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Book b : books) {

                        if (b.bookId == searchId) {

                            b.displayBook();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID To Issue: ");
                    int issueId = sc.nextInt();

                    for (Book b : books) {

                        if (b.bookId == issueId) {

                            if (!b.isIssued) {

                                b.isIssued = true;
                                System.out.println("Book Issued Successfully!");

                            } else {

                                System.out.println("Book Already Issued!");
                            }
                        }
                    }

                    break;

                case 5:

                    System.out.print("Enter Book ID To Return: ");
                    int returnId = sc.nextInt();

                    for (Book b : books) {

                        if (b.bookId == returnId) {

                            if (b.isIssued) {

                                b.isIssued = false;
                                System.out.println("Book Returned Successfully!");

                            } else {

                                System.out.println("Book Was Not Issued!");
                            }
                        }
                    }

                    break;

                case 6:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}