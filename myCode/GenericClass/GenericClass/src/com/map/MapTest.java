package com.map;

import org.junit.Test;

public class MapTest {

	@Test
	public void test() {
		Map<String,Object> map = new Map<String,Object>();
		map.add("1", "第一个元素");
		map.add("2", new Integer(1));
		map.add("3", new String("Hello"));
		map.get("3");
		System.out.println(map.get("3"));
		System.out.println(map.get("2"));
		System.out.println(map.get("1"));
	}

}
