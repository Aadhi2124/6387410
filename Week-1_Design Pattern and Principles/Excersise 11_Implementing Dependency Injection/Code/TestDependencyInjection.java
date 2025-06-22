package design_principles.dependency_injection_example;

public class TestDependencyInjection {

	public static void main(String[] args) {
		CustomerRepository repository = new CustomerRepositoryImpl();
		CustomerService service = new CustomerService(repository);
		
		service.showCustomerDetails("CUST101");
	}

}
