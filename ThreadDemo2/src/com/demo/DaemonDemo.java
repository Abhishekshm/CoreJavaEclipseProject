package com.demo;

public class DaemonDemo extends Thread {
	public void run() {
		// TODO Auto-generated method stub

		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() + "  : Daemon Thread is Running---------"
					+ Thread.currentThread().getPriority());
		} else {
			System.out.println(Thread.currentThread().getName() + "  : user Thread is Running---------"
					+ Thread.currentThread().getPriority());

		}
	}

	public static void main(String[] args) {

		DaemonDemo d = new DaemonDemo();
		DaemonDemo d1 = new DaemonDemo();
		DaemonDemo d2 = new DaemonDemo();

		d.setDaemon(true);
		d.start();
		d1.start();
		d2.start();

	}

}
