package com.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Plate {
	List<Object> eggs = new ArrayList<Object>();
	
	public synchronized Object getEgg(){
		while(eggs.size() == 0){
			try {
				System.out.println(Thread.currentThread().getName()+" is waiting...");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Object egg = eggs.get(0);
		eggs.clear(); 
		notify();
		System.out.println(Thread.currentThread().getName()+" ƒ√µΩº¶µ∞");
		return egg;
	}
	
	public synchronized void putEgg(Object egg){
		while(eggs.size()>0){
			try {
				System.out.println(Thread.currentThread().getName()+" is waiting...");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		eggs.add(egg);
		notify();
		System.out.println(Thread.currentThread().getName()+" ∑≈»Îº¶µ∞");
	}
	
	static class AddThread implements Runnable{
		private Plate plate;
		private Object egg = new Object();
		public AddThread(Plate plate){
			this.plate = plate;
		}
		public void run() {
			plate.putEgg(egg);
		}
	}
	
	static class GetThread implements Runnable{
		private Plate plate;
		public GetThread(Plate plate){
			this.plate = plate;
		}
		public void run() {
			plate.getEgg();
		}
	}
	
	public static void main(String[] args) {
		Plate plate = new Plate();
		for(int i=0;i<10;i++){
			new Thread(new AddThread(plate)).start();
			new Thread(new GetThread(plate)).start();
		}
	}
}
