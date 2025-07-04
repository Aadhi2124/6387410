package design_principles.dependency_injection_example;

public class Customer {
	private String id;
	private String name;
	private String email;
	
	public Customer(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Customer ID : "+id);
		System.out.println("Customer Name : "+name);
		System.out.println("Customer email : "+email);
	}
	
}
