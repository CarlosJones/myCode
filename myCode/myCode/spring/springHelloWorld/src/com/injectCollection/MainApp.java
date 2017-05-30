package com.injectCollection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("injectCollection.xml");
		Department department = (Department)context.getBean("department");
		System.out.println(department.getName());
		for(String empName:department.getEmpName()){
			System.out.println(empName);
		}
		System.out.println("*****get from List******");
		for(Employee employee:department.getEmpList()){
			System.out.println(employee.getId());
			System.out.println(employee.getName());
		}
		System.out.println("******get from set*******");
		for(Employee emp:department.getEmpSet()){
			System.out.println(emp.getId());
			System.out.println(emp.getName());
		}
		System.out.println("*****get from map*********");
		Map<String,Employee> emps = department.getEmpMap();
		Iterator<String> it = emps.keySet().iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			Employee emp = emps.get(key);
			System.out.println("key="+key+" "+"value="+emp.getName());
		}
		System.out.println("****get from properties*****");
		Properties properties = department.getProperties();
		Enumeration<?> en = properties.keys();
		while(en.hasMoreElements()){
			String key = (String)en.nextElement();
			System.out.println(key+" "+properties.getProperty(key));
		}
	}
}
