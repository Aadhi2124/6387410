package design_principles.singleton_pattern_example;

public class TestLogger {

	public static void main(String[] args) {

		Logger l1 = Logger.getLogger();
		Logger l2 = Logger.getLogger();
		
		l1.log("Aadhi");
		
		if(l1 == l2) {
			System.out.println("Both Objects having same instance");
		}
		else {
			System.out.println("Both are Different");
		}
	}

}
