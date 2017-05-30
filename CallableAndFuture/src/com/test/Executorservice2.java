package com.test;

import java.util.concurrent.*;

public class Executorservice2 {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(pool);
		for(int i=0;i<5;i++){
			final int taskID = i;
			cs.submit(new Callable<Integer>(){
				public Integer call(){
					return taskID;
				}
			});
		}
		
		for(int i=0;i<5;i++){
			try {
				System.out.println(cs.take().get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
	}
}
