package com.tutorialspoint.Exceptions;

class mythread extends Thread {
	public void run() {
		System.out.println("throw exception in mythread ");
		throw new RuntimeException("RuntimeException!!!");
	}
}
public class ThreadException {

	public static void main(String[] args) {
		mythread mt= new mythread();
		
		try {
			//Thread.sleep(1000);
			mt.start();
		} catch (Exception e) {
			System.out.println("caught Exception");
		//} catch (RuntimeException e) {
		//	System.out.println("caught RuntimeException");
		}

	}

}
