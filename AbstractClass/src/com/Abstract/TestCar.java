package com.Abstract;

public class TestCar {
	public static void main(String[] args) {

		Car c;
		BMWCar b = new BMWCar();
		c = b;
		b.startCar();

		AudiCar a = new AudiCar();

		a.startCar();
	}
}