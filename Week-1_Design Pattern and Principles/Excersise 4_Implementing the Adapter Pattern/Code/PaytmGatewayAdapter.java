package design_principles.adapter_pattern_example;

public class PaytmGatewayAdapter implements PaymentProcessor{
	
	private PaytmGateway paytmGateway;
	
	public PaytmGatewayAdapter(PaytmGateway paytmGateway) {
		this.paytmGateway = paytmGateway;
	}

	@Override
	public void processpayment(double amount) {
		paytmGateway.makePayment(amount);
	}

}
