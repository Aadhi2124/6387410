package design_principles.dependency_injection_example;

public interface CustomerRepository {
	Customer findCustomerById(String id);
}
