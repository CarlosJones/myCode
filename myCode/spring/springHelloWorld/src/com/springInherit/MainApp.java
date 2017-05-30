package com.springInherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("inherit.xml");
		HelloWorld world=(HelloWorld)context.getBean("helloWorld");
		HelloIndia india=(HelloIndia)context.getBean("helloIndia");
		world.getMessage1();
		world.getMessage2();
		india.getMessage1();
		india.getMessage2();
		india.getMessage3();
	}
}