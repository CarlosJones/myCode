package com.simpleTest;

public class DoSomething implements Runnable{
	private String name;
//	private Integer i = 0;
	Counter c = new Counter();
    public DoSomething(String name) {
        this.name = name;
    }

    public void run() {
//    	int i = 0;
        while(c.count<15) {
        	c.count++;
            System.out.println(name + ": " + c.count +Thread.currentThread().getName());
        }
    } 

}
