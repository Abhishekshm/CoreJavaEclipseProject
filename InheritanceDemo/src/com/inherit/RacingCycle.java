package com.inherit;
/*
Program: Inheritance Examples Single level
@author: Abhishek Sharma
@date: 27th sept 2022
*/

//declare class RacingCycle and Inherit MountainCycle class
public class RacingCycle extends MountainCycle {

	// Instance variable
	private boolean GPS;
	private String light;
	private String speedBooster;

	// defalut Constructor
	public RacingCycle() {
		super();

	}

	// paramaterized Constructor
	public RacingCycle(String wheel, int seatLevel, String brake, int noOfGear, double speed, boolean gPS, String light,
			String speedBooster) {
		super(wheel, seatLevel, brake, noOfGear, speed);
		GPS = gPS;
		this.light = light;
		this.speedBooster = speedBooster;
	}

	// 1st getter and setter
	public boolean isGPS() {
		return GPS;
	}

	public void setGPS(boolean gPS) {
		GPS = gPS;
	}

	// 2nd getter and setter
	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	// 3rd getter and setter
	public String getSpeedBooster() {
		return speedBooster;
	}

	public void setSpeedBooster(String speedBooster) {
		this.speedBooster = speedBooster;
	}

	@Override
	public String toString() {
		return "RacingCycle [GPS=" + GPS + ", light=" + light + ", speedBooster=" + speedBooster + ", "
				+ super.toString();
	}

}
