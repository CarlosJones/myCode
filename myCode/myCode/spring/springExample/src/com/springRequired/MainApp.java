package com.springRequired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("required.xml");
		Student stu =(Student)context.getBean("student");
		stu.getAge();
		stu.getName();
	}
}
