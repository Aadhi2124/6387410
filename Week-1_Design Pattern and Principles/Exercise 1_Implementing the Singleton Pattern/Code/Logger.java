package design_principles.singleton_pattern_example;

public class Logger {
	private static Logger logger;
	
	private Logger() {
		
	}

	public static Logger getLogger() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
	
	public void log(String username) {
		System.out.println("[Logged] "+username);
	}
}
