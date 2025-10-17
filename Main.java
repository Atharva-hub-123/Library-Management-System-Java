import java.util.Scanner;
import service.LibraryService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryService service = new LibraryService();
        int choice;

        do {
            System.out.println("\n===== 📚 Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. List All Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 : service.addBook();
                case 2 : service.registerMember();
                case 3 : service.borrowBook();
                case 4 : service.returnBook();
                case 5 : service.searchBook();
                case 6 : service.listAllBooks();
                case 0 : System.out.println("👋 Exiting... Thank you for using the Library System!");
                default : System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}
