package com.springCustomEvent;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context =
				new ClassPathXmlApplicationContext("customEvent.xml");
		CustomEventPublisher cep = (CustomEventPublisher)context.getBean("customEventPublisher");
		cep.publish();
		cep.publish();
	}
}
