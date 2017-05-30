package com.event.test;

public class MyEvent{
	private Object object;

	public MyEvent(Object eventSource) {
		object = eventSource;
	}
	
	public Object getEventSource(){
		return object;
	}
}
