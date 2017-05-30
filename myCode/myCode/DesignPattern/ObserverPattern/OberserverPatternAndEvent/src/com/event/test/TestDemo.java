package com.event.test;

public class TestDemo {
	public static void main(String[] args) {
		try{
			EventSource eventSource = new EventSource();
			ListenerDaoImpl1 listener1 = new ListenerDaoImpl1();
			ListenerDaoImpl2 listener2 = new ListenerDaoImpl2();
			eventSource.addListener(listener1);
			eventSource.addListener(listener2);
			eventSource.addListener(new ListenerDao(){
				public void demoEvent(MyEvent myEvent){
					System.out.println("Method come from 匿名类...");
				}
			});
			eventSource.notifyEvent();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
