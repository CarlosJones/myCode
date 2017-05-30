package com.tutorial;

public class HelloWorld {
	private String message;

	public String getMessage() {
		System.out.println("The message is:"+message); 
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("Bean is going through init.");
	}
	
	public void destroy(){
		System.out.println("Bean is destroy now.");
	}
}
