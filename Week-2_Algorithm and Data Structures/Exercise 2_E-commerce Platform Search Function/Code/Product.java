package algorithm_data_structures.ecommerce_platform_search;

public class Product {
	private String productId;
	private String productName;
	private String catogory;
	public Product(String productId, String productName, String catogory) {
		this.productId = productId;
		this.productName = productName;
		this.catogory = catogory;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCatogory() {
		return catogory;
	}
	public void setCatogory(String catogory) {
		this.catogory = catogory;
	}
	public void display() {
		System.out.println("------------------------------------------");
		System.out.println("Product ID : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Product Catogory : "+catogory);
		System.out.println("------------------------------------------");
	}
	
}
