package design_principles.observer_pattern_example;

public class MobileApp implements Observer{
	
	private String appName;
	
	public MobileApp(String appName) {
		this.appName = appName;
	}

	@Override
	public void update(String stockName, double stockPrice) {
		System.out.println(appName+ " - Mobile Stock Update: "+stockName+" $ :"+stockPrice);
	}

	
}
