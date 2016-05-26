package com.tutorialspoint.Threads;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;

class DataObject {
	SynchronousQueue<String> q = new SynchronousQueue<String>();
	void Put(String s) throws InterruptedException{
		q.put(s);
	}
	String Get() {
		return (String) q.poll();
	}
}

class ProducerThread extends Thread {
	DataObject dp;
	ProducerThread(DataObject data){
		System.out.println("I am Producer thread");
		dp = data;
	}
	public void run() {
		String st="Hello";
		try {
			System.out.println("I am putting "+st);
			dp.Put(st);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class ConsumerThread extends Thread {
	DataObject dc;
	ConsumerThread(DataObject data){
		System.out.println("I am Consumer thread");
		dc = data;
	}
	public void run() {
		String st = dc.Get();
		System.out.println("I am polling "+st);
	}
}
public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		DataObject str = new DataObject();
		Thread tp = new Thread(new ProducerThread(str));
		Thread tc = new Thread(new ConsumerThread(str));
		tp.start();
		Thread.sleep(1);
		tc.start();
	}

}
