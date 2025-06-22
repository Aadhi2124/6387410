package algorithm_data_structures.library_management_system;

public class TestBook {

	public static void main(String[] args) {

		Book[] books = {
	            new Book("B101", "The Alchemist", "Paulo Coelho"),
	            new Book("B102", "Atomic Habits", "James Clear"),
	            new Book("B103", "Think and Grow Rich", "Napoleon Hill"),
	            new Book("B104", "Zero to One", "Peter Thiel")
	        };
		
		System.out.println("Linear Search for 'Atomic Habits':");
        Book result1 = SearchBook.linearSearch(books, "Atomic Habits");
        if (result1 != null) result1.display();
        else System.out.println("Book not found.");
        
        // Sort for Binary Search
        SearchBook.sortByTitle(books);

        System.out.println("\n Binary Search for 'Zero to One':");
        Book result2 = SearchBook.binarySearch(books, "Zero to One");
        if (result2 != null) result2.display();
        else System.out.println("Book not found.");
	}

}
