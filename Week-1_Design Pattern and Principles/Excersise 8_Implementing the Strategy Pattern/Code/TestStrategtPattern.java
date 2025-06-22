package design_principles.strategy_pattern_example;

public class TestStrategtPattern {

	public static void main(String[] args) {

		PaymentContext payContext = new PaymentContext();
		
		//For PalPal
		payContext.setPaymentStrategy(new PayPalPayment("jhon123@gmail.com"));
		
		payContext.executePayment(4000);
		
		//For CreditCard
		payContext.setPaymentStrategy(new CreditCardPayment("65FE6TF7D", "AADHI"));
		
		payContext.executePayment(9000);
	}

}
