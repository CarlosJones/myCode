package com.xml;

public class Student {
	private Integer age;
	private String name;
	public Integer getAge() {
		System.out.println("age:"+age);
		return age;
	}
	public String getName() {
		System.out.println("name:"+name);
		return name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void printThrowException(){
		System.out.println("Exception raised.");
		throw new IllegalArgumentException();
	}
}
