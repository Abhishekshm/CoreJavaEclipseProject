package com.demo2;

public class Table {

	/*
	 * 1.Process 2.Thread
	 * 
	 * a.Mutual Exclusive:-Threads Cannot interfere and share the data
	 * 
	 * keyword----synchronized
	 * 
	 * Method Block Static
	 */

	synchronized static void PrintTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}
