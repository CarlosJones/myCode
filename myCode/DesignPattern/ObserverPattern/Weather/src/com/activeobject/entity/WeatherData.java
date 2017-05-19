package com.activeobject.entity;

/**
 *@Description:一个pojo类 
 *@author:Carlos
 *@time:2017年5月19日上午10:10:59
 */
public class WeatherData {
	private String temperature;
	private String humidity;
	private String pressure;
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getPressure() {
		return pressure;
	}
	public void setPressure(String pressure) {
		this.pressure = pressure;
	}
}
