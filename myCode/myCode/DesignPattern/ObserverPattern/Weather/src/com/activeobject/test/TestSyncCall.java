package com.activeobject.test;

import com.activeobject.entity.WeatherData;
import com.activeobject.service.WeatherService;

/**
 *@Description:TODO 
 *@author:Carlos
 *@time:2017年5月19日上午10:22:27
 */
public class TestSyncCall {
	public static void main(String[] args) {
		WeatherData data = WeatherService.getWeatherInfo();
		System.out.println("After calling weather service,I was blocked.");
		System.out.println("Now I really need weather data.");
		System.out.println("气温:"+data.getTemperature());
	}
}
