package com.producerConsumer.lock;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Storage {
	private int MAX_SIZE = 99;
	private List<Object> list = new LinkedList<Object>();

	private Lock lock = new ReentrantLock();
	private final Condition full = lock.newCondition();
	private final Condition empty = lock.newCondition();

	public void produce(int num) {
		try {
			lock.lock();
			while (list.size() + num > MAX_SIZE) {
				try {
					System.out.println(Thread.currentThread().getName()+" producer is waiting...");
					full.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for (int i = 0; i < num; i++) {
				list.add(new Object());
			}
			System.out.println(Thread.currentThread().getName() + " produce " + num);
			empty.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public void consume(int num){
		try{
			lock.lock();
			while(list.size()<num){
				try {
					System.out.println(Thread.currentThread().getName()+" consumer is waiting...");
					empty.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for(int i=0;i<num;i++){
				list.remove(0);
			}
			System.out.println(Thread.currentThread().getName()+" consume "+num);
			full.signalAll();
		}finally{
			lock.unlock();
		}
	}
}
