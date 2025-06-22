package design_principles.decorator_pattern;

public class SlackNotifierDecorator extends NotifierDecorator{

	public SlackNotifierDecorator(Notifier notifer) {
		super(notifer);
	}
	
	@Override
	public void send(String message) {
		super.send(message);
		sendSlack(message);
	}
	
	private void sendSlack(String message) {
		System.out.println("Slack sent: "+ message);
	}

}
