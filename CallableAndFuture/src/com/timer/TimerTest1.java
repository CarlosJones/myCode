package com.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest1 {
	static class MyTimerTask1 extends TimerTask{
		public void run(){
			System.out.println("地球人，从不回头看爆炸！！！");
		}
	}
	
	static class MyTimerTask2 extends TimerTask{
		public void run(){
			System.out.println("爆炸!!!");
			new Timer().schedule(new MyTimerTask1(),3000);
		}
	}
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask2(), 2000);
		while(true){
			System.out.println(new Date().getTime());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
