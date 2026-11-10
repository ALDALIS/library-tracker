
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> books = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Library Tracker =====");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    listBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    removeBook();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    static void addBook() {
        System.out.print("Enter book title: ");
        String title = input.nextLine();

        books.add(title);
        System.out.println("Book added successfully!");
    }

    static void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    static void searchBook() {
        System.out.print("Enter title to search: ");
        String title = input.nextLine();

        if (books.contains(title)) {
            System.out.println("Book found!");
        } else {
            System.out.println("Book not found.");
        }
    }

    static void removeBook() {
        System.out.print("Enter title to remove: ");
        String title = input.nextLine();

        if (books.remove(title)) {
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found.");
        }
    }
}
