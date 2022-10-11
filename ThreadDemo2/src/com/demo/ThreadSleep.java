package com.demo;

public class ThreadSleep extends Thread {

	ThreadSleep() {

	}

	ThreadSleep(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

	public static void main(String[] args) {
		ThreadSleep t = new ThreadSleep("My Thread 1"); // tight coupling
		ThreadSleep t1 = new ThreadSleep("Mythread 2");
		ThreadSleep t2 = new ThreadSleep("My thread 3");
		t.start();
		try {
			t.join(); // locking the resourses of other Threads
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
