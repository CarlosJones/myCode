package com.event.test;

import java.util.Enumeration;
import java.util.Vector;

public class EventSource {
	private Vector<ListenerDao> repository = new Vector<ListenerDao>();
	private ListenerDao ld;
	public EventSource(){}
	public void addListener(ListenerDao l){
		repository.addElement(l);
	}
	
	public void notifyEvent(){
		Enumeration<ListenerDao> enumeration = repository.elements();
		while(enumeration.hasMoreElements()){
			ld = (ListenerDao)enumeration.nextElement();
			ld.demoEvent(new MyEvent(this));	//通知所有该监听事件的监听者
		}
	}
}