package com.springEventHandler;

public class HelloWorld {
	private String message;

	public String getMessage() {
		System.out.println("message is:"+message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
