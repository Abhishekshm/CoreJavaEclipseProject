package com.demo2;

import java.util.Scanner;

public class Mythread2 extends Thread {

	Table t;

	public Mythread2() {
		this.t = t;
	}

	public void run() {

		table();
		System.out.println("-----------------------");

	}

	public void table() {
		System.out.println("enter two tables you want to see ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		t.PrintTable(n);
	}
}
