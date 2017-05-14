package com.BrokerAndStock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Broker {
	private List<Order> orderlist = new ArrayList<Order>();
	private Iterator<Order> iterator;
	
	public void takeOrder(Order order){
		orderlist.add(order);
	}
	public void placeOrder(){
		iterator = orderlist.iterator();
		while(iterator.hasNext()){
			Order order = iterator.next();
			order.execute();
		}
	}
}
