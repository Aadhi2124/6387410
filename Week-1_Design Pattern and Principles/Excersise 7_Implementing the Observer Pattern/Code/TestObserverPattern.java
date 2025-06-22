package design_principles.observer_pattern_example;

public class TestObserverPattern {

	public static void main(String[] args) {

		StockMarket stockMarket = new StockMarket();
		
		Observer mobile1 = new MobileApp("Amazon");
		Observer moblie2 = new MobileApp("Rapido");
		Observer web1 = new WebApp("TATA");
		Observer web2 = new WebApp("TESLA");
		
		stockMarket.register(mobile1);
		stockMarket.register(moblie2);
		stockMarket.register(web1);
		stockMarket.register(web2);
		
		stockMarket.setStockData("COGNIZANT", 5000.56);
		System.out.println();
		
		stockMarket.setStockData("TCS", 6000.26);
		System.out.println();
		
		stockMarket.setStockData("INFOSYS", 3000.74);
		System.out.println();
		
		stockMarket.deregister(web2);
		stockMarket.setStockData("WIPRO", 2000.13);
		
	}

}
