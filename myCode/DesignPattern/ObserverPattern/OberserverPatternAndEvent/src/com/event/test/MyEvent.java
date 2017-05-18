package com.event.test;

import java.util.EventObject;

@SuppressWarnings("serial")
public class MyEvent extends EventObject {
	private Object object;

	public MyEvent(Object eventSource) {
		super(eventSource);
		object = eventSource;
	}
	
	public Object getEventSource(){
		return object;
	}
}
