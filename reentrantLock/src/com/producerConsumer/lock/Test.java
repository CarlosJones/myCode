package com.producerConsumer.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		final Storage storage = new Storage();
		for (int i = 0; i < 5; i++) {
			pool.execute(new Runnable() {
				public void run() {
					int i=0;
					while (i<10) {
						storage.consume(20);
						i++;
					}
				}
			});
			pool.execute(new Runnable() {
				public void run() {
					int i=0;
					while (i<10) {
						storage.produce(20);
						i++;
					}
				}
			});
		}
		pool.shutdown();
	}
}
