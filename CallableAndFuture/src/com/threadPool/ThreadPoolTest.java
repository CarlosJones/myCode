package com.threadPool;

import java.util.concurrent.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadPoolTest {
	public static void main(String[] args) {
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);
		pool.schedule(new Runnable(){
			public void run(){
				System.out.println("��ը");
			}
		}, 5, TimeUnit.SECONDS);
		pool.scheduleAtFixedRate(new Runnable(){
			public void run(){
				System.out.println("�����ˣ��Ӳ���ͷ����ը");
			}
		}, 5, 1, TimeUnit.SECONDS);
	}
}
