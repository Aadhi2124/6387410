package design_principles.observer_pattern_example;

public class WebApp implements Observer {
	
private String platform;
	
	public WebApp(String platform) {
		this.platform = platform;
	}

	@Override
	public void update(String stockName, double stockPrice) {
		System.out.println(platform+ " - Web Stock Upadte: "+stockName+" $ :"+stockPrice);
	}

}
