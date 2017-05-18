package com.event.button;

public class EventBinder {
	public static void bindEvents(){
		EventDispatcher eventDispatcher = EventDispatcher.getInstance();
		try {
			eventDispatcher.addEventListener(EventNames.Click, new clickHandler());
			eventDispatcher.addEventListener(EventNames.DoubleClick, new doubleClickHandler());
		} catch (EventAlreadyRegisteredException e) {
			e.printStackTrace();
		}
	}
}
