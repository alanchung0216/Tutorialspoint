package com.tutorialspoint.Networking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConnectWebHost {

	//public static void main(String[] args) throws UnknownHostException, IOException {
	public static void main(String[] args) {
		InetAddress addr;
		try {
			Socket	sk = new Socket("www.javattorial.com", 80);
			addr = sk.getInetAddress();
			System.out.println("socket info "+sk.getPort());
			System.out.println("socket addr "+addr);
			sk.close();			
		} catch (UnknownHostException e) {
			System.out.println("UnknownHostException  " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}

	}

}
