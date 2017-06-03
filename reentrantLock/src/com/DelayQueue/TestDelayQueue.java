package com.DelayQueue;

import java.util.concurrent.DelayQueue;

public class TestDelayQueue {
	public static void main(String[] args) throws InterruptedException {
		DelayQueue<DelayedElement> queue = new DelayQueue<DelayedElement>();
		DelayedElement el = new DelayedElement("cache 5 secends",5000);
		queue.put(el);
		System.out.println(queue.take());
	}
}
