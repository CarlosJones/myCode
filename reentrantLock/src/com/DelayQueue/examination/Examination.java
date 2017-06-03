package com.DelayQueue.examination;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Examination {
	static final int SIZE = 30;

	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		DelayQueue<Student> students = new DelayQueue<Student>();
		ExecutorService pool = Executors.newFixedThreadPool(SIZE);
		for (int i = 0; i < SIZE; i++) {
			// 初始化学生的姓名和做题时间
			students.put(new Student("学生" + (i + 1), 3000 + r.nextInt(10000)));
		}
		//开始做题
        while(!students.isEmpty()){
               pool.execute( students.take());
        }
        pool.shutdown();
	}
}
