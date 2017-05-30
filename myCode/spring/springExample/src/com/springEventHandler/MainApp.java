package com.springEventHandler;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("event.xml");
		context.start();
		HelloWorld hw = (HelloWorld)context.getBean("helloWorld");
		hw.getMessage();
	    context.stop();
	}
}
