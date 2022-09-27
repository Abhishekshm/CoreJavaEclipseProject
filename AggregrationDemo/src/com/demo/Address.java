package com.demo;

/*
Program: Aggregration Examples
@author: Abhishek Sharma
@date: 27th sept 2022
*/
//declare class Address
public class Address {
	// Instance Variable
	private String addressLine1;
	private String city;
	private int pincode;
	private String state;

	// Defalult Constructor
	public Address() {
		super();

	}

	// Paramaterized Constructor
	public Address(String addressLine1, String city, int pincode, String state) {
		super();
		this.addressLine1 = addressLine1;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	// 1st getter and setter
	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	// 2nd getter and setter
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// 3rd getter and setter
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	// 4th getter and setter
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", city=" + city + ", pincode=" + pincode + ", state=" + state
				+ "]";
	}

}
