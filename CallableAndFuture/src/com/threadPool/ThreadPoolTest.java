package com.threadPool;

import java.util.concurrent.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadPoolTest {
	public static void main(String[] args) {
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);
		pool.schedule(new Runnable(){
			public void run(){
				System.out.println("爆炸");
			}
		}, 5, TimeUnit.SECONDS);
		pool.scheduleAtFixedRate(new Runnable(){
			public void run(){
				System.out.println("地球人，从不回头看爆炸");
			}
		}, 5, 1, TimeUnit.SECONDS);
	}
}
