package com.example;

public class TestFinally {

	public static void main(String[] args) {
		System.out.println("System Exit");
		try {
			String str = null;

			System.out.println(str.length());

		} finally {
			System.exit(0); // exit the program immediatly
		}
	}
}
