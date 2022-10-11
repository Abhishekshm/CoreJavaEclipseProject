package com.demo2;

import java.util.Scanner;

public class Mythread1 extends Thread {

	Table t;

	public Mythread1() {
		this.t = t;
	}

	public void run() {
//		System.out.println("-----------------------");
		table();
	}

	public void table() {
		System.out.println("enter 1st table you want to see ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		t.PrintTable(n);
	}
}
