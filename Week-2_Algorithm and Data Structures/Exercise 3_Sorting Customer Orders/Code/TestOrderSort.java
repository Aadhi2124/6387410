package algorithm_data_structures.sorting_customer_orders;

public class TestOrderSort {
	public static void main(String[] args) {
		Order[] orders = {
				new Order("O101", "Aadhishwar", 7500),
	            new Order("O102", "Kavitha", 14999),
	            new Order("O103", "Dharani", 5000),
	            new Order("O104", "Deepika", 20000)
	        };
		System.out.println("--------Original Orders--------\n");
		for (Order order : orders) {
			order.display();
		}
		
		//Bubble Sort
		SortOrder.bubbleSort(orders);
		System.out.println("\n--------Bubble Sort-----------");
		for (Order order : orders) {
			order.display();
		}
		
		//For quickSort shuffling again
		Order[] quickorders = {
				new Order("O101", "Aadhishwar", 7500),
	            new Order("O102", "Kavitha", 14999),
	            new Order("O103", "Dharani", 5000),
	            new Order("O104", "Deepika", 20000)
	        };
		SortOrder.quickSort(quickorders, 0, quickorders.length-1);
		System.out.println("\n--------Quick Sort-----------");
		for (Order o : quickorders) {
			o.display();
		}
		
	}
}
