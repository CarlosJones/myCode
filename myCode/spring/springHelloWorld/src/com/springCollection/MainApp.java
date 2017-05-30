package com.springCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springCollection.xml");
		JavaCollection jc= (JavaCollection)context.getBean("javaCollection");
		jc.getAddressList();
		jc.getAddressMap();
		jc.getAddressSet();
		jc.getAddressProp();
	}
}
