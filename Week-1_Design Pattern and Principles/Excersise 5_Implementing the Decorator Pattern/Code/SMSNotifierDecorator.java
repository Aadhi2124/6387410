package design_principles.decorator_pattern;

public class SMSNotifierDecorator extends NotifierDecorator {

	public SMSNotifierDecorator(Notifier notifer) {
		super(notifer);
	}
	
	@Override
	public void send(String message) {
		super.send(message);
		sendSMS(message);
	}
	
	private void sendSMS(String message) {
		System.out.println("SMS sent: "+ message);
	}
	
}
