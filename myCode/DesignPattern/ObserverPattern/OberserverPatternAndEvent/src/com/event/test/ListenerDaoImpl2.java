package com.event.test;

public class ListenerDaoImpl2 implements ListenerDao {

	@Override
	public void demoEvent(MyEvent myEvent) {
		System.out.println("Inside listener2...");
	}

}
