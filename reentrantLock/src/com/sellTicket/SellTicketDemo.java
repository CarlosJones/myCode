package com.sellTicket;

public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket ticket = new SellTicket();
		Thread t1 = new Thread(ticket,"����1");
		Thread t2 = new Thread(ticket,"����2");
		Thread t3 = new Thread(ticket,"����3");
		t1.start();
		t2.start();
		t3.start();
	}
}
