package com.BrokerAndStock;

public class BuyOrder implements Order {
	private Stock stock;
	
	public BuyOrder(Stock stock){
		this.stock = stock;
	}

	public void buyOrder(){
		System.out.println("Using buyOrder to buy stock.");
		stock.buy();
	}
	public void execute() {
		this.buyOrder();
	}

}