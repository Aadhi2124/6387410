package design_principles.decorator_pattern;

public class TestDecoratorPattern {

	public static void main(String[] args) {
		Notifier notifier = new EmailNotifier();
		
		notifier = new SMSNotifierDecorator(notifier);
		
		notifier = new SlackNotifierDecorator(notifier);
		
		notifier.send("We will notify you again at 5pm");
	}

}
