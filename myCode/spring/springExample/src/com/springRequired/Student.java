package com.springRequired;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer age;
	private String name;
	public Integer getAge() {
		System.out.println("age="+age);
		return age;
	}
	public String getName() {
		System.out.println("name="+name);
		return name;
	}
//	@Required
	@Autowired(required=false)
	public void setAge(Integer age) {
		this.age = age;
	}
//	@Required
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
}
