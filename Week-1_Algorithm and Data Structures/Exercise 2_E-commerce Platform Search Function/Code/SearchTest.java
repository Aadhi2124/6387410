package algorithm_data_structures.ecommerce_platform_search;

public class SearchTest {

	public static void main(String[] args) {
		Product[] products = {
				new Product("P101","Mobile","Electronics"),
				new Product("P102", "Shirt", "Cloth"),
				new Product("P103", "Laptop", "Electronics"),
				new Product("P104", "Bottle", "Plastics"),
				new Product("P105", "Mouse", "Electronics")
		};
		System.out.println("----Linear Search : Search for shirt----");
		
		Product res1 = SearchProduct.linearSearch(products, "shirt");
		
		if(res1 != null) {
			res1.display();
		}
		else {
			System.out.println("Product Not Found");
		}
		
		System.out.println("----Binary Search : search for Mouse----");
		//Sorting Products Based on names for Binary Search
		SearchProduct.sortbyName(products);
		
		Product res2 = SearchProduct.binarySearch(products, "mouse");
		
		if(res2 != null) res2.display();
		else System.out.println("Product Not Found");
		
	}

}
