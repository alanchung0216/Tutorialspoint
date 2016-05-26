package com.tutorialspoint.Networking;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1) Java doesn't support multiple inheritance, which means you can only extend 
 * one class in Java so once you extended Thread class you lost your chance and 
 * can not extend or inherit another class in Java.

 * 2) In Object oriented programming extending a class generally means adding new 
 * functionality, modifying or improving behaviors. If we are not making any 
 * modification on Thread than use Runnable interface instead.


 * Read more: 
 * http://javarevisited.blogspot.com/2012/01/difference-thread-vs-runnable-interface.html
 
 * start
 public void start() Causes this thread to begin execution; the Java Virtual Machine 
 calls the run method of this thread. 
The result is that two threads are running concurrently: the current thread 
(which returns from the call to the start method) and the other thread 
(which executes its run method). 

It is never legal to start a thread more than once. In particular, 
a thread may not be restarted once it has completed execution.
 

Throws: IllegalThreadStateException - if the thread was already started.
--------------------------------------------------------------------------------

 * run
 public void run() If this thread was constructed using a separate Runnable 
 run object, then that Runnable object's run method is called; otherwise, this 
 method does nothing and returns. Subclasses of Thread should override this method. 


 Specified by:run in interface Runnable 
 *
 */

public class MultiThreadServer implements Runnable {
	int i=0;
	Socket cs;
	MultiThreadServer(Socket s){
		this.cs=s;
	}
	public void run() {
		System.out.println("multithread  "+ ++i);
		try {
	         PrintStream pstream = new PrintStream
	         (cs.getOutputStream());
	         for (int i = 100; i >= 0; i--) {
	            pstream.println(i + 
	            " bottles of beer on the wall");
	         }
	         pstream.close();
	         cs.close();
	      }
	      catch (IOException e) {
	         System.out.println(e);
	      }
		
	}
	
	// Throwable caught Exceptions and Errors
	// public static void main(String[] args) throws Throwable{
	public static void main(String[] args) throws IOException{

		//t1.start();
		//t2.start();
		ServerSocket ss = new ServerSocket(6000);
		System.out.println("listening");
		while (true) {
			Socket sock = ss.accept();
			System.out.println("connected");
			MultiThreadServer mts = new MultiThreadServer(sock);
			Thread t1 = new Thread(mts);
			t1.start();	
		}	
	}

}
