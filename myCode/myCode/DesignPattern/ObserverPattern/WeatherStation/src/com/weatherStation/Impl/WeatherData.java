package com.weatherStation.Impl;

import java.util.Enumeration;
import java.util.Vector;

import com.weatherStation.Interface.Observer;
import com.weatherStation.Interface.Subject;

public class WeatherData implements Subject {
	private Vector<Observer> vector = null;
	private float temp;
	private float humidity;
	private float pressure;
	private Observer o;

	public WeatherData() {
		vector = new Vector<Observer>();
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public void registerObserver(Observer O) {
		vector.addElement(O); 
	}

	public void removeObserver(Observer O) {
		vector.remove(O); 
	}

	public void notifyObservers(Observer O) {
		Enumeration<Observer> enumx = vector.elements();
		while(enumx.hasMoreElements()){
			o = enumx.nextElement();
			o.update(temp, humidity, pressure); 
		}
	}

}
