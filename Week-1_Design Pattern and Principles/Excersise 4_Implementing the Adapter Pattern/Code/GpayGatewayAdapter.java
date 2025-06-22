package design_principles.adapter_pattern_example;

public class GpayGatewayAdapter implements PaymentProcessor{
	
	private GpayGateway gpayGateway;
	
	public GpayGatewayAdapter(GpayGateway gpayGateway) {
		this.gpayGateway = gpayGateway;
	}

	@Override
	public void processpayment(double amount) {
		
		gpayGateway.pay(amount);
		
	}
	
}
