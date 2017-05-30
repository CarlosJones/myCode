package com.springEventHandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedEventHandler 
	implements ApplicationListener<ContextStartedEvent>{
	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
			System.out.println("ContextStartedEvent received.");
	}
}
