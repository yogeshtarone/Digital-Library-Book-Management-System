  # Digital Library Book Management System

## Overview

The Digital Library Book Management System is a simple Java application designed to help librarians manage a collection of books. The system allows users to:

 - Add new books to the catalog.

 - View a list of all books.

 - Search for books by ID or title.

 - Update book details.

 - Delete books from the catalog.

This system is implemented in Java and provides a simple text-based interface for managing the library's book records.

## Features
 - Add a Book: Adds a new book to the library with details such as ID, title, author, genre, and availability status.

 - View All Books: Displays a list of all books in the library.

 - Search Book by ID or Title: Allows searching for books using either their unique ID or title.

 - Update Book Details: Modifies details such as availability status, title, or author of an existing book.

 - Delete Book Record: Removes a book from the catalog.

 - Exit System: Exits the application.

## Requirements
- Java version 8 or above.

 To check if Java is installed, you can run the following command in your terminal or command prompt:  java -version


## Usage
 When you run the application, you will be presented with a simple menu. The menu options are:

- Add Book: Add a new book to the system by entering the book's ID, title, author, genre, and availability status.

- View All Books: Displays a list of all books stored in the library catalog.

- Search Book: Allows you to search for a book by its ID or title.

- Update Book: Modify the details of an existing book, including its availability status or other attributes.

- Delete Book: Remove a book from the catalog using its ID.

- Exit: Exit the application.

## Example Interaction

Welcome to Digital Library Book Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book
5. Delete Book
6. Exit
Enter choice (1-6): 1
Enter Book ID: 101
Enter Title: "The Great Gatsby"
Enter Author: F. Scott Fitzgerald
Enter Genre: Fiction
Enter Status (Available/Checked Out): Available
Book added successfully!

## Assumptions and Constraints
- Book ID must be unique for each book in the catalog.

- Title and Author fields must not be empty.

- Availability Status should be either "Available" or "Checked Out".

- The system does not persist data between sessions (i.e., all data is lost once the program is closed).

## Challenges
 During the development of this project, the following challenges were encountered:

- Data Validation: Ensuring that inputs for fields such as book ID, title, and availability status were properly validated was a key challenge. I needed to ensure that the ID was unique and that the availability status was either "Available" or "Checked Out."

- Handling User Input: The program must gracefully handle invalid input (e.g., non-numeric input for ID or invalid menu options). This required extensive use of try-catch blocks and input validation checks.

- Efficient Searching and Updating: Implementing an efficient search and update mechanism was challenging. In this implementation, I used a HashMap to store books using their ID as the key for faster lookups.

- Edge Cases: Some edge cases, such as attempting to add a book with an existing ID or trying to delete a book that doesn't exist, required proper exception handling to ensure a smooth user experience.
