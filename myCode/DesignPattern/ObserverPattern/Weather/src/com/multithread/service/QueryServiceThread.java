package com.multithread.service;

/**
 *@Description:TODO 
 *@author:Carlos
 *@time:2017年5月20日下午6:45:56
 */
public class QueryServiceThread extends Thread{
		public void run(){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
}
