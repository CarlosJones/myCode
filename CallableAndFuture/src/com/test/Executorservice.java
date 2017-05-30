package com.test;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Executorservice {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		FutureTask<Integer> future = (FutureTask<Integer>) threadPool.submit(new Callable<Integer>(){
			public Integer call(){
				return new Random().nextInt();
			}
		});
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
