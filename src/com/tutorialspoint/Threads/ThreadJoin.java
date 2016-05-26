package com.tutorialspoint.Threads;

public class ThreadJoin {
	static Thread t1 = new Thread("thread 1"){
		public void run ()	{
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("end thread 1");
		}
	};
	static Thread t2 = new Thread("thread 2"){
		public void run ()	{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("end thread 2");
		}
	};

	public static void main(String[] args) {
		t1.start();
		try {
			t1.join();
			Thread.sleep(10000);
			System.out.println("ready to start thread 2");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}
