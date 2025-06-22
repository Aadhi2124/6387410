package design_principles.adapter_pattern_example;

public class GpayGateway {

	public void pay(double amount) {
		System.out.println("Payment of $ " + amount + " processed via Gpay");
	}
}
