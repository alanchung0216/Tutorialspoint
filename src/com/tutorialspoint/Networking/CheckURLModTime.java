package com.tutorialspoint.Networking;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CheckURLModTime {

	public static void main(String[] args) throws IOException {
		URL u = new URL("http://www.tutorialspoint.com/javaexamples/net_webpage.htm");
		URLConnection uc = u.openConnection();
		uc.setUseCaches(false);
		long timestamp = uc.getLastModified();
		System.out.println("last modified time " + timestamp);
		
		System.out.println("URL is "+ u.toString());
		System.out.println("protocol is "+ u.getProtocol());
		System.out.println("file name is "+ u.getFile());
		System.out.println("host name is "+ u.getHost());
		System.out.println("path is "+ u.getPath());
		System.out.println("port is "+ u.getPort());
		System.out.println("default port is "+ u.getDefaultPort());
		
		
	}

}
