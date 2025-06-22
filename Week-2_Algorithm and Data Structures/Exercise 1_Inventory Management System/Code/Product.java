package algorithm_data_structures.inventory_management_system;

public class Product {
	private String productId;
	private String productName;
	private int noOfProducts;
	private double price;
	public Product(String productId, String productName, int noOfProducts, double price) {
		this.productId = productId;
		this.productName = productName;
		this.noOfProducts = noOfProducts;
		this.price = price;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public int getNoOfProducts() {
		return noOfProducts;
	}
	public double getPrice() {
		return price;
	}
	public void display() {
		System.out.println("------------------------------------------");
		System.out.println("Product ID : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("No of Product : "+noOfProducts);
		System.out.println("Price $ "+price);
		System.out.println("------------------------------------------");
	}
	
	
}
