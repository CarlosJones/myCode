package com.sellTicket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
	private int ticket = 20;
	private Lock lock = new ReentrantLock();
	public void run() {
		while(ticket>0){
			try{
				lock.lock();
					try {
						ticket--;
						System.out.println(Thread.currentThread().getName()+"正在出售第"+(20-ticket)+"张票。");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}finally{
				lock.unlock();
			}
		}
	}
}
