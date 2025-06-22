package design_principles.decorator_pattern;

public class EmailNotifier implements Notifier{

	@Override
	public void send(String message) {
		System.out.println("Email sent :"+message);
	}
	
}
