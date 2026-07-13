
import java.util.Scanner;

class Main {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        Library lb = new Library();
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Search by title");
            System.out.println("4. List all books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {

                case 1:
                    System.out.print("Enter Book Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Issued at: ");
                    String issuedAt = sc.nextLine();

                    System.out.print("Updated at: ");
                    String updatedAt = sc.nextLine();

                    Book book = new Book(id, title, author, issuedAt, updatedAt);
                    lb.addBook(book);
                    System.out.println("Book added. ");
                    break;
                case 2:
                    System.out.print("Enter Book Id to remove: ");
                    int removeId = sc.nextInt();
                    sc.nextLine();

                    if (lb.removeBook(removeId)) {
                        System.out.println("Book removed.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter title to search: ");
                    String searchTitle = sc.nextLine();
                    Book foundBook = lb.findBookByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    lb.listBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option, try again.");
                    break;

            }

        }
    }
}
