package com.vector;

import org.junit.Test;

public class VectorTest {

	@Test
	public void test() {
		Vector<String> v = new Vector<String>();
		v.add("第一个");
		v.add("第二个");
		v.showAllElements();
	}

}
