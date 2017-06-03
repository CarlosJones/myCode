package com.DelayQueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedElement implements Delayed {
	private long expired;
	private long delay;
	private String name;

	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setExpired(long expired) {
		this.expired = expired;
	}

	DelayedElement(String elementName, long delay) {
		this.name = elementName;
		this.delay = delay;
		expired = (delay + System.currentTimeMillis());
	}	

	@Override
	public int compareTo(Delayed o) {
		 DelayedElement cached=(DelayedElement) o;
         return cached.getExpired()> expired?1:-1;
//		 return 0;
	}

	@Override
	public long getDelay(TimeUnit arg0) {
		System.out.println(expired - System. currentTimeMillis());
		return ( expired - System. currentTimeMillis());
//		return 1;
	}

	public long getExpired() {
        return expired;
 }
}
