package algorithm_data_structures.ecommerce_platform_search;

import java.util.Arrays;
import java.util.Comparator;

public class SearchProduct implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		return p1.getProductName().compareToIgnoreCase(p2.getProductName());
	}
	public static Product linearSearch(Product[] products , String name) {
		for (Product p : products) {
			if(p.getProductName().equalsIgnoreCase(name)) {
				return p;
			}
		}
		return null;
	}
	
	public static Product binarySearch(Product[] sortedproducts, String name) {
		int left = 0, right = sortedproducts.length-1;
		while(left <= right) {
			int mid = (left + right)/2;
			int cmp = sortedproducts[mid].getProductName().compareToIgnoreCase(name);
			if(cmp == 0) {
				return sortedproducts[mid];
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
	
	public static void sortbyName(Product[] products) {
		Arrays.sort(products,new SearchProduct());
	}
}
