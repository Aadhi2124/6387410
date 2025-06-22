package algorithm_data_structures.employee_management_system;

public class ManageEmployee {
	private Employee[] employee;
	private int count;
	
	public ManageEmployee(int size) {
		employee = new Employee[size];
		count = 0;
	}
	
	public void addEmployee(Employee emp) {
		if(count < employee.length) {
			employee[count++] = emp;
			System.out.println("Employee Added Successfully");
		}
		else {
			System.out.println("Employee list is full.");
		}
	}
	public Employee searchById(String id) {
		for (int i = 0; i < count; i++) {
			if(employee[i].getEmployeeId().equals(id)) {
				return employee[i];
			}
		}
		return null;
	}
	public void displayAll() {
		if(count == 0) {
			System.out.println("No Employee in List");
		}
		else {
			for (int i = 0; i < count; i++) {
				employee[i].display();
			}
		}
	}
	public void deleteById(String id) {
		for(int i = 0;i < count;i++) {
			if(employee[i].getEmployeeId().equals(id)) {
				for (int j = i; j < count - 1; j++) {
                    employee[j] = employee[j + 1];
                }
                employee[--count] = null;
                System.out.println("Employee deleted.");
                return;
			}
		}
		System.out.println("Employee ID not found.");
	}
}
