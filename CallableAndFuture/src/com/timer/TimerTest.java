package com.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
	public static class MyTimerTask1 extends TimerTask{
		public void run() {
			System.out.println("±¬Õ¨£¡£¡£¡");
		}
	}
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask1(), 2000);
	}
}
