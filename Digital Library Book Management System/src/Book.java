public class Book {
	private String bookId;
	private String title;
	private String author;
	private String genre;
	private String availabilityStatus;

	public Book(String bookId, String title, String author, String genre, String availabilityStatus) {
		if (title == null || title.isEmpty() || author == null || author.isEmpty()) {
			throw new IllegalArgumentException("Title and Author cannot be empty.");
		}
		if (!availabilityStatus.equals("Available") && !availabilityStatus.equals("Checked Out")) {
			throw new IllegalArgumentException("Availability status must be 'Available' or 'Checked Out'.");
		}

		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.availabilityStatus = availabilityStatus;
	}

	public String getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public String getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(String availabilityStatus) {
		if (availabilityStatus.equals("Available") || availabilityStatus.equals("Checked Out")) {
			this.availabilityStatus = availabilityStatus;
		} else {
			throw new IllegalArgumentException("Availability status must be 'Available' or 'Checked Out'.");
		}
	}

	@Override
	public String toString() {
		return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Genre: " + genre
				+ ", Availability: " + availabilityStatus;
	}
}
