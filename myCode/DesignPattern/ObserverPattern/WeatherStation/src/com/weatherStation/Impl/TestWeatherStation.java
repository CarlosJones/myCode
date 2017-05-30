package com.weatherStation.Impl;

public class TestWeatherStation {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentConditionsDisplay display = new CurrentConditionsDisplay(data);
		data.setHumidity(20);
		data.setTemp(36);
		data.notifyObservers(display);
	}
}
