package algorithm_data_structures.inventory_management_system;
import java.util.*;

public class Inventory {
	private HashMap<String ,Product> products = new HashMap<String, Product>();
	
	public void addProduct(Product product) {
		if(products.containsKey(product.getProductId())) {
			System.out.println("Product ID already Exists : "+product.getProductId());
		}
		else {
			products.put(product.getProductId(), product);
			System.out.println("Product Successfully Added");
		}
	}
	
	public void removeProduct(String id) {
		if(products.remove(id) != null) {
			System.out.println("Product Successfully Deleted");
		}
		else {
			System.out.println("Product Not Found");
		}
	}
	
	public void updateProduct(String id,String name,int noOfProduct,double price) {
		Product product = products.get(id);
		
		if(product != null) {
			product.setProductName(name);
			product.setNoOfProducts(noOfProduct);
			product.setPrice(price);
			System.out.println("Product Successfully Updated");
		}
	}
	
	public void displayInventory() {
		if(products.isEmpty()) {
			System.out.println("Inventory is Empty");
		}
		else {
			for (Product p : products.values()) {
				p.display();
			}
		}
	}
}
