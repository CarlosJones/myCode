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
			// ��ʼ��ѧ��������������ʱ��
			students.put(new Student("ѧ��" + (i + 1), 3000 + r.nextInt(10000)));
		}
		//��ʼ����
        while(!students.isEmpty()){
               pool.execute( students.take());
        }
        pool.shutdown();
	}
}
