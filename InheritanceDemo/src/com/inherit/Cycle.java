package com.inherit;
/*
Program: Inheritance Examples
@author: Abhishek Sharma
@date: 27th sept 2022
*/

//declaring class
public class Cycle {

	// Instance variable
	private String wheel;
	private int seatLevel;
	private String brake;

	// Defalut Constructor
	public Cycle() {
		super();

	}

	// paramateized Constructor
	public Cycle(String wheel, int seatLevel, String brake) {
		super();
		this.wheel = wheel;
		this.seatLevel = seatLevel;
		this.brake = brake;
	}

	// 1st getter and setter
	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	// 2nd getter and setter
	public int getSeatLevel() {
		return seatLevel;
	}

	public void setSeatLevel(int seatLevel) {
		this.seatLevel = seatLevel;
	}

	// 3rd getter and setter
	public String getBrake() {
		return brake;
	}

	public void setBrake(String brake) {
		this.brake = brake;
	}

	@Override
	public String toString() {
		return " Cycle : [wheel=" + wheel + ", seatLevel=" + seatLevel + ", brake=" + brake + "]";
	}

}
