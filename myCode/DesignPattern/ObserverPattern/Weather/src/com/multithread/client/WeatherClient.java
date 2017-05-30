package com.multithread.client;

import com.activeobject.entity.WeatherData;
import com.multithread.service.ServiceThread;

/**
 *@Description:TODO 
 *@author:Carlos
 *@time:2017年5月20日下午6:58:55
 */
public class WeatherClient implements Runnable{

	public void getData(WeatherData wData) {
		System.out.println("Client get Weather Data.");
		System.out.println("气温:"+wData.getTemperature());
	}

	public void run() {
		ServiceThread service = ServiceThread.getInstance();
		service.getWeatherInfo(this);
		for(int i=0;i<=12;i++){
			try {
				System.out.println("client counting:"+i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
