package com.multithread.service;

import com.activeobject.entity.WeatherData;

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
