package algorithm_data_structures.inventory_management_system;

public class InventoryTest {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		
		//O(1) average
		inventory.addProduct(new Product("P101","Mobile",100,35000));
		//O(1) average
		inventory.addProduct(new Product("P102","Laptop",537,6353.43));
		
		//O(n)
		inventory.displayInventory();
		
		//O(1) average
		inventory.updateProduct("P102", "Professionl Laptop", 352, 6742.34);
		
		//O(1) average
		inventory.removeProduct("P101");
		
		//O(n)
		inventory.displayInventory();
		
	}

}
