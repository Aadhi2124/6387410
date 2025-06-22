package design_principles.dependency_injection_example;

public class CustomerService {
	private CustomerRepository cusrepo;

	public CustomerService(CustomerRepository cusrepo) {
		this.cusrepo = cusrepo;
	}
	
	public void showCustomerDetails(String id) {
		Customer customer = cusrepo.findCustomerById(id);
		customer.display();
	}
	
}
