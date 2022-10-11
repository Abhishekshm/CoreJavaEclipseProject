package com.demo2;

public class Mythread2 extends Thread {

	Table t;

	public Mythread2() {
		this.t = t;
	}

	public void run() {

		t.PrintTable(5);
		System.out.println("-----------------------");

	}
}
