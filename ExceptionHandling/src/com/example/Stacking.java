package com.example;

public class Stacking {

	static void method1() {
		try {
			System.out.println("In Method 1");
			method2();
		} catch (Exception e) {
			System.out.println("Number is not divisible by zero");
		}
	}

	static void method2() {
		System.out.println("In method 2");
		method3();
	}

	static void method3() {
		System.out.println("In method 3");
		int a = 12, b = 0;
		int sum = a / b;
		System.out.println(sum);

	}

	public static void main(String[] args) {

		method1();
	}

}
