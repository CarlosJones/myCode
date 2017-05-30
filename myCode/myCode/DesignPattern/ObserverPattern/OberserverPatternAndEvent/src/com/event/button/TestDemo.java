package com.event.button;

public class TestDemo {
	public static void main(String[] args) throws UnkownEventException {
		Event eClick = new Event(EventNames.Click,"单击事件");
		Event eDClick = new Event(EventNames.DoubleClick,"双击事件");
		EventBinder.bindEvents();
		EventDispatcher eventDispatcher = EventDispatcher.getInstance();
		eventDispatcher.dispatchEvent(eClick);
		eventDispatcher.dispatchEvent(eDClick); 
	}
}
