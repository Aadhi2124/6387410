package design_principles.strategy_pattern_example;

public class CreditCardPayment implements PaymentStrategy {
	
	private String cardNumber;
	private String cardHolderName;
	
	

	public CreditCardPayment(String cardNumber,String cardHolderName){
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
	}



	@Override
	public void pay(double amount) {
		System.out.println("Paid $ "+amount+" Using Credit Card ("+cardHolderName+")");
	}
	
}
