package design_principles.strategy_pattern_example;

public class PayPalPayment implements PaymentStrategy {
	
	private String email;

	public PayPalPayment(String email) {
		this.email = email;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paid $ "+amount+" Using PayPal account "+email);
	}

}
