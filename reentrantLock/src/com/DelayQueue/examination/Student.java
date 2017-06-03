package com.DelayQueue.examination;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Student implements Runnable, Delayed {
	private String name; // ����
	private long costTime;// �������ʱ��
	private long finishedTime;// ���ʱ��

	public Student(String name, long costTime) {
		this.name = name;
		this.costTime = costTime;
		finishedTime = costTime + System.currentTimeMillis();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCostTime() {
		return costTime;
	}

	public void setCostTime(long costTime) {
		this.costTime = costTime;
	}

	public long getFinishedTime() {
		return finishedTime;
	}

	public void setFinishedTime(long finishedTime) {
		this.finishedTime = finishedTime;
	}

	@Override
	public int compareTo(Delayed o) {
		Student other = (Student) o;
        return costTime >= other. costTime?1:-1;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return ( finishedTime - System. currentTimeMillis());
	}

	@Override
	public void run() {
		System. out.println( name + " ����,��ʱ" + costTime /1000);
	}

}
