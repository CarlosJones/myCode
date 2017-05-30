package com.DISetFunction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("DISetFunction.xml");
		TextEdit edit = (TextEdit)context.getBean("textEdit");
		edit.getSpellChecker();
		edit.spellCheck();
	}
}
