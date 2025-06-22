package algorithm_data_structures.library_management_system;

public class Book {
 private String bookId;
 private String title;
 private String author;

 public Book(String bookId, String title, String author) {
     this.bookId = bookId;
     this.title = title;
     this.author = author;
 }

 public String getTitle() {
     return title;
 }

 public void display() {
     System.out.println("ID: " + bookId + ", Title: " + title + ", Author: " + author);
 }
}