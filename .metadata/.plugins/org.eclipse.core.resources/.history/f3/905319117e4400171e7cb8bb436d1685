package com.deadlock;

public class DeadLock extends Thread {
	private boolean flag;
	public DeadLock(boolean flag){
		this.flag = flag;
	}
	public void run(){
		if(flag){
			synchronized(MyLock.objA){
				System.out.println("if objA."+Thread.currentThread().getName());
				try {
					Thread.sleep(2*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(MyLock.objB){
					System.out.println("if objB"+Thread.currentThread().getName());
					try {
						Thread.sleep(2*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}else{
			synchronized(MyLock.objB){
				System.out.println("if objB"+Thread.currentThread().getName());
				try {
					Thread.sleep(2*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(MyLock.objA){
					System.out.println("if objA"+Thread.currentThread().getName());
					try {
						Thread.sleep(2*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
