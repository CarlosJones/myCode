package com.simpleTest;

import org.junit.Test;

public class DoSomethingTest {

	@Test
	public void Synchronizedtest() throws InterruptedException {
		DoSomething ds = new DoSomething("张三");
		Thread t1 = new Thread(ds);
		Thread t2 = new Thread(ds);
		t1.start();
		t2.start();
//		t2.join();
		System.out.println("Main thread is not yield.");
		Thread.yield();
		System.out.println("Main thread is yeild.");
	}
}
