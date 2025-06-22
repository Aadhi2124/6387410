package algorithm_data_structures.library_management_system;

import java.util.Arrays;
import java.util.Comparator;

public class SearchBook  implements Comparator<Object>{

		@Override
		public int compare(Object o1, Object o2) {
			Book b1 = (Book) o1;
			Book b2 = (Book) o2;
			return b1.getTitle().compareToIgnoreCase(b2.getTitle());
		}
	public static Book linearSearch(Book[] books, String title) {
		for (Book b : books) {
			if(b.getTitle().equalsIgnoreCase(title)) {
				return b;
			}
		}
		return null;
	}
	public static Book binarySearch(Book[] sortedbooks, String title) {
		int left = 0, right = sortedbooks.length-1;
		while(left <= right) {
			int mid = (left + right)/2;
			int cmp = sortedbooks[mid].getTitle().compareToIgnoreCase(title);
			if(cmp == 0) {
				return sortedbooks[mid];
			}
			else if(cmp < 0) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return null;
	}
	public static void sortByTitle(Book[] book) {
		Arrays.sort(book,new SearchBook());
	}
}