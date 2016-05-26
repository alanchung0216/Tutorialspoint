package com.tutorialspoint.Networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLCOnnection {

	public static void main(String[] args) throws IOException {
		URL u = new URL("http://www.ogle.com");
		HttpURLConnection con = (HttpURLConnection) u.openConnection();
		if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
			System.out.println("response code "+con.getResponseCode());
		} else {
			System.out.println("response code not 200 - code is "+con.getResponseCode());
		}
	}

}
