package com.demo2;

public class Mythread1 extends Thread {

	Table t;

	public Mythread1() {
		this.t = t;
	}

	public void run() {
		System.out.println("-----------------------");
		t.PrintTable(6);
	}
}
