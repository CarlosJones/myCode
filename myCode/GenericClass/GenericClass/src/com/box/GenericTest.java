package com.box;

public class GenericTest {
	public static void main(String[] args) {
		Box<String> box = new Box<String>("Hello");
//		System.out.println(box.getData());
		String data = box.getData();
	}
}