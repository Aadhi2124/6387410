package design_principles.strategy_pattern_example;

public class PaymentContext {
	private PaymentStrategy paymentStrategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void executePayment(double amount) {
		if(paymentStrategy == null) {
			System.out.println("Payment Strategy in not Assigned!");
		}
		else {
			paymentStrategy.pay(amount);
		}
	}
}
