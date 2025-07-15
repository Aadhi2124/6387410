package org.library.service;

import org.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String libraryName;

    // Constructor for injection
    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    // Setter for repository injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        System.out.println("Library: " + libraryName);
        System.out.println("Listing all books...");
        bookRepository.fetchBooks();
    }
}
