package design_principles.adapter_pattern_example;

public class TestAdapter {

	public static void main(String[] args) {

		GpayGateway gpayGateway = new GpayGateway();
		GpayGatewayAdapter gpayAdapter = new GpayGatewayAdapter(gpayGateway);
				
		gpayAdapter.processpayment(5000);
		
		PaytmGateway paytm = new PaytmGateway();
		PaytmGatewayAdapter paytmAdapter = new PaytmGatewayAdapter(paytm);
		
		paytmAdapter.processpayment(9000);
	}

}
