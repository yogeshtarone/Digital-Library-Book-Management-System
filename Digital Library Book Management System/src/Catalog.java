import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Book> books;

    public Catalog() {
        books = new HashMap<>();
    }

    // Add a new book to the catalog
    public void addBook(Book book) {
        if (books.containsKey(book.getBookId())) {
            System.out.println("Book ID " + book.getBookId() + " already exists.");
        } else {
            books.put(book.getBookId(), book);
            System.out.println("Book '" + book.getTitle() + "' added to the catalog.");
        }
    }

    // View all books in the catalog
    public void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the catalog.");
        } else {
            for (Map.Entry<String, Book> entry : books.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    // Search a book by ID or Title
    public void searchBook(String searchTerm) {
        boolean found = false;
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            if (book.getBookId().equals(searchTerm) || book.getTitle().toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching books found.");
        }
    }

    // Update book details
    public void updateBook(String bookId, String title, String author, String availabilityStatus) {
        Book book = books.get(bookId);
        if (book != null) {
            if (title != null && !title.isEmpty()) book = new Book(bookId, title, author != null ? author : book.getAuthor(), book.getGenre(), book.getAvailabilityStatus());
            if (author != null && !author.isEmpty()) book = new Book(bookId, book.getTitle(), author, book.getGenre(), book.getAvailabilityStatus());
            if (availabilityStatus != null && !availabilityStatus.isEmpty()) book.setAvailabilityStatus(availabilityStatus);
            books.put(bookId, book);
            System.out.println("Book ID " + bookId + " updated.");
        } else {
            System.out.println("No book found with ID " + bookId + ".");
        }
    }

    // Delete a book from the catalog
    public void deleteBook(String bookId) {
        if (books.containsKey(bookId)) {
            books.remove(bookId);
            System.out.println("Book ID " + bookId + " removed from the catalog.");
        } else {
            System.out.println("No book found with ID " + bookId + ".");
        }
    }
}
