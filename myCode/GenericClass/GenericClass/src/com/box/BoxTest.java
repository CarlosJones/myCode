package com.box;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoxTest {
	@Test
	public void testString() {
		Box<String> box = new Box<String>("Hello");
		String data = box.getData();
		assertEquals("Box的结果出错", "Hello",data);
	}
	@Test
	public void testInteger(){
		Box<Integer> box = new Box<Integer>(110);
		Integer data = box.getData();
		assertTrue(data==110);
		assertEquals((Integer)110,data);
	}
	@Test
	public void test(){
		Box<?> box = new Box<Long>(1L);
		assertEquals(1L,box.getData());
	}
}
