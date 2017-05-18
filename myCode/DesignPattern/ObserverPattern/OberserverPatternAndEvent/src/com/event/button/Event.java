package com.event.button;

public class Event {
	private String action;
	private String message;
	
	public Event(String action,String message){
		this.setAction(action);
		this.setMessage(message);
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}
}
