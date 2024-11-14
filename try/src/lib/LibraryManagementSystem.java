package lib;

import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn, true));
                    break;

                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    isbn = scanner.nextLine();
                    try {
                        library.removeBook(isbn);
                        System.out.println("Book removed successfully.");
                    } catch (CustomException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}