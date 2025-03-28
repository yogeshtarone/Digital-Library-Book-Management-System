import java.util.Scanner;

public class LibrarySystem {
	private static Catalog catalog = new Catalog();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		
		while (running) {
			System.out.println("*******************************************************");
			System.out.println("**                                                   **");
			System.out.println("** Welcome to Digital Library Book Management System **");
			System.out.println("**                                                   **");
			System.out.println("*******************************************************");
			
			System.out.println("1. Add a Book");
			System.out.println("2. View All Books");
			System.out.println("3. Search Book by ID or Title");
			System.out.println("4. Update Book Details");
			System.out.println("5. Delete a Book Record");
			System.out.println("6. Exit");

			System.out.print("Enter choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				// Add a Book
				System.out.print("Enter Book ID: ");
				String bookId = scanner.nextLine();
				System.out.print("Enter Title: ");
				String title = scanner.nextLine();
				System.out.print("Enter Author: ");
				String author = scanner.nextLine();
				System.out.print("Enter Genre: ");
				String genre = scanner.nextLine();
				System.out.print("Enter Availability (Available/Checked Out): ");
				String availabilityStatus = scanner.nextLine();

				Book newBook = new Book(bookId, title, author, genre, availabilityStatus);
				catalog.addBook(newBook);
				break;

			case 2:
				// View All Books
				catalog.viewAllBooks();
				break;

			case 3:
				// Search Book by ID or Title
				System.out.print("Enter Book ID or Title: ");
				String searchTerm = scanner.nextLine();
				catalog.searchBook(searchTerm);
				break;

			case 4:
				// Update Book Details
				System.out.print("Enter Book ID to update: ");
				String updateId = scanner.nextLine();
				System.out.print("Enter new Title (or leave blank to keep current): ");
				String newTitle = scanner.nextLine();
				System.out.print("Enter new Author (or leave blank to keep current): ");
				String newAuthor = scanner.nextLine();
				System.out.print("Enter new Availability (Available/Checked Out, or leave blank to keep current): ");
				String newAvailability = scanner.nextLine();

				catalog.updateBook(updateId, newTitle.isEmpty() ? null : newTitle,
						newAuthor.isEmpty() ? null : newAuthor, newAvailability.isEmpty() ? null : newAvailability);
				break;

			case 5:
				// Delete a Book Record
				System.out.print("Enter Book ID to delete: ");
				String deleteId = scanner.nextLine();
				catalog.deleteBook(deleteId);
				break;

			case 6:
				// Exit System
				running = false;
				System.out.println("Exiting the system...");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}

		scanner.close();
	}
}
