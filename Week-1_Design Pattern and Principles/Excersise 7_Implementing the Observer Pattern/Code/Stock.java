package design_principles.observer_pattern_example;

public interface Stock {
	
	void register(Observer o);
	void deregister(Observer o);
	void Notify();

}
