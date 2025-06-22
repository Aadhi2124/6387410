package algorithm_data_structures.employee_management_system;

public class TestEmployee {

	public static void main(String[] args) {

		ManageEmployee me = new ManageEmployee(5);
		
		me.addEmployee(new Employee("E101", "Aadhishwar", "Developer", 45000));
        me.addEmployee(new Employee("E102", "Arul", "Designer", 40000));
        me.addEmployee(new Employee("E103", "Kavitha", "Tester", 35000));
        
        System.out.println("\n All Employees:");
        me.displayAll();
        
        System.out.println("\n Search for E102:");
        Employee e = me.searchById("E102");
        if (e != null) e.display();
        else System.out.println("Employee not found.");

        System.out.println("\n Delete E102:");
        me.deleteById("E102");

        System.out.println("\n Employees After Deletion:");
        me.displayAll();
	}

}
