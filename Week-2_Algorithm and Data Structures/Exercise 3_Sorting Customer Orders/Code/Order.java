package algorithm_data_structures.sorting_customer_orders;

public class Order {
	private String orderId;
	private String customerName;
	private double totalPrice;
	public Order(String orderId, String customerName, double totalPrice) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.totalPrice = totalPrice;
	}
	public double getTotalPrice() {
		return totalPrice;
	}	
	public void display() {
		System.out.println("Order ID : "+orderId);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Total Price : "+totalPrice);
	}
}
