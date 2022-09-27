package com.demo;

/*
Program: Aggregration Examples
@author: Abhishek Sharma
@date: 27th sept 2022
*/
public class Charger {

	private String chargerName;
	private String volt;

	public Charger() {
		super();

	}

	public Charger(String chargerName, String volt) {
		super();
		this.chargerName = chargerName;
		this.volt = volt;
	}

	public String getChargerName() {
		return chargerName;
	}

	public void setChargerName(String chargerName) {
		this.chargerName = chargerName;
	}

	public String getVolt() {
		return volt;
	}

	public void setVolt(String volt) {
		this.volt = volt;
	}

	@Override
	public String toString() {
		return " " + chargerName + " " + volt;
	}

}
