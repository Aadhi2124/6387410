package design_principles.dependency_injection_example;

public class CustomerRepositoryImpl implements CustomerRepository{

	@Override
	//In Real Applications, this will connect to DB
	public Customer findCustomerById(String id) {
		return new Customer(id,"Aadhi","aadhi@gmail.com");
	}

}
