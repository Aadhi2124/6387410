package design_principles.decorator_pattern;

public abstract class NotifierDecorator implements Notifier{
	private Notifier notifier;

	public NotifierDecorator(Notifier notifer) {
		this.notifier = notifer;
	}
	
	@Override
	public void send(String message) {
		notifier.send(message);
	}
	
}
