package com.multithread.test;

import com.multithread.client.WeatherClient;
import com.multithread.service.ServiceThread;

/**
 *@Description:TODO 
 *@author:Carlos
 *@time:2017年5月20日下午7:58:50
 */
public class TestMulti {
	public static void main(String[] args) {
		WeatherClient client = new WeatherClient();
		ServiceThread service = ServiceThread.getInstance();
		Thread Tclient = new Thread(client);
		Thread Tservice = new Thread(service);
		Tclient.start();
		Tservice.start();
	}
}