package design_principles.observer_pattern_example;

import java.util.*;

public class StockMarket implements Stock {
	
	private List<Observer> observers = new ArrayList<>();
	private String stockName;
	private double stockPrice;
	
	

	public void setStockData(String stockName, double stockPrice) {
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		Notify();
	}

	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void deregister(Observer o) {
		observers.remove(o);
	}

	@Override
	public void Notify() {
		for (Observer o : observers) {
			o.update(stockName,stockPrice);
		}
	}

}
