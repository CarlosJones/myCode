package com.BrokerAndStock;

public class SellOrder implements Order{
	private Stock stock;
	
	public SellOrder(Stock stock){
		this.stock = stock;
	}

	public void sellOrder(){
		System.out.println("Using sellOrder to sell stock.");
		stock.sell();
	}
	public void execute() {
		this.sellOrder();
	}
}
