package com.inherit;
/*
Program: Inheritance Examples Single level
@author: Abhishek Sharma
@date: 27th sept 2022
*/

//declare class ElectricCycle and Inherit Cycle class
public class ElectricCycle extends Cycle {

	// Instance variable
	private String battery;

	// defalut constructor
	public ElectricCycle() {
		super();

	}

	// paramaterized Constructor
	public ElectricCycle(String wheel, int seatLevel, String brake, String battery) {
		super(wheel, seatLevel, brake);
		this.battery = battery;
	}

	// 1st getter and setter
	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "ElectricCycle [battery=" + battery + "] other details of " + super.toString();
	}

}
