package com.multithread.service;

import java.util.Enumeration;
import java.util.Vector;

import com.activeobject.entity.WeatherData;
import com.multithread.client.WeatherClient;

/**
 *@Description:TODO 
 *@author:Carlos
 *@time:2017年5月20日下午6:46:55
 */
public class ServiceThread implements Runnable {
	private static ServiceThread service = null;
	
	private ServiceThread(){}
	
	public static synchronized ServiceThread getInstance(){
		if(null == service)
			service = new ServiceThread();
		return service;
	}

	private Vector<WeatherClient> vector = new Vector<WeatherClient>();
	private WeatherClient c = null;
	
	public synchronized void addClient(WeatherClient client){
		vector.addElement(client);  
	}
	
	public void notifyClient(WeatherData wData){
		Enumeration<WeatherClient> enumx = vector.elements();
		while(enumx.hasMoreElements()){
			c = enumx.nextElement();
			c.getData(wData);
		}
	}
	public void run() {
		while(vector.isEmpty()){
			System.out.println("WeatherService is waiting...");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			QueryServiceThread query = new QueryServiceThread();
			query.start();
			query.join();
			notifyClient(getWeatherData());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public void getWeatherInfo(WeatherClient client){
		System.out.println("WeatherService service...");
		addClient(client);
	}
	
	public WeatherData getWeatherData(){
		WeatherData wData = new WeatherData();
		wData.setTemperature("30");
		wData.setHumidity("20");
		wData.setPressure("50");
		return wData;
	}
}
