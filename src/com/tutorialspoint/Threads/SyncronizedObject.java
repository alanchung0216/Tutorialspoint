package com.tutorialspoint.Threads;

class DataObject1{
	int count=0;
	public void addcount() {
		++count;
		//System.out.println("My count is " + ++count);
	}
}

class MyThread implements Runnable {
	DataObject1 dt;
	String threadname;
	MyThread(DataObject1 dd, String tn){
		dt = dd;
		threadname = tn;
		System.out.println("Thread name is  " + threadname);
	}
	public void run() {
		System.out.println("Started Thread  " + threadname);
			while (dt.count < 6) {
				try {
					Thread.sleep(1);
					synchronized(dt) { 
						dt.addcount();
						System.out.println("Thread  " + threadname + " " + dt.count);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
}


public class SyncronizedObject {
/*	
	static Thread t1 = new Thread("My Thread one"){
		public void run (){
			System.out.println("started t1 ");
			
		}
	};
	static Thread t2 = new Thread("Mu Thread two"){
		public void run (){
			System.out.println("started t2 ");
			
		}
	};
*/
	public static void main(String[] args) {
		DataObject1 data = new DataObject1();
		MyThread mt1 = new MyThread(data,"MyThread1");
		MyThread mt2 = new MyThread(data,"MyThread2");
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();
	}

}
