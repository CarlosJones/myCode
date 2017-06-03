package com.producerConsumer.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Storage {
	private BlockingQueue<Object> list = new LinkedBlockingQueue<Object>(100);

	public void produce(int num) {
			for (int i = 0; i < num; i++) {
				try {
					list.put(new Object());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " produce " + num+" list size = "+list.size());
	}
	
	public void consume(int num){
			for(int i=0;i<num;i++){
				try {
					list.take();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " consume " + num+" list size = "+list.size());
	}
}
