package com.demo;

import java.util.Scanner;

public class ThreadPriority extends Thread {

	public ThreadPriority() {

	}

	ThreadPriority(String name) {
		super(name);
	}

	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

//		System.out.println("Prority of the Current Thread: " + Thread.currentThread().getPriority());

//		Thread.currentThread().setPriority(MAX_PRIORITY);
//
//		System.out.println("After Changing The Priority: " + Thread.currentThread().getPriority());
		Scanner sc = new Scanner(System.in);
		ThreadPriority p = new ThreadPriority("1st  ");
		ThreadPriority p1 = new ThreadPriority("2nd  ");
		ThreadPriority p2 = new ThreadPriority("3rd  ");

		System.out.println("set the priority of 1st Thread");
		p.setPriority(sc.nextInt());

		// ---------------------------------------------------------------//
		System.out.println("set the priority of 2nd Thread");
		p1.setPriority(sc.nextInt());

		// ---------------------------------------------------------------//
		System.out.println("set the priority of 1st Thread");
		p2.setPriority(sc.nextInt());

		System.out.println("Priroty of 1st Thread is " + p.getPriority());
		System.out.println("Priroty of 2nd Thread is " + p1.getPriority());
		System.out.println("Priroty of 3rd Thread is " + p2.getPriority());
		p.start();
		p1.start();
//		p.setPriority(MIN_PRIORITY);
		p2.start();
//		p.setPriority(NORM_PRIORITY);

//		String n = null;
//		System.out.println(n);
//
//		System.gc();
//		System.out.println(n);
//
		sc.close();
	}
}
