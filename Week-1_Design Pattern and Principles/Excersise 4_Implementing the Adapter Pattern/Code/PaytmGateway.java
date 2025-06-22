package design_principles.adapter_pattern_example;

public class PaytmGateway {
	public void makePayment(double amount) {
		System.out.println("Payment of $ " + amount + " processed via Paytm");
	}
}
