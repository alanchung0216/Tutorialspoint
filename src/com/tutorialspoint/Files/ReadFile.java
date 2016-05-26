package com.tutorialspoint.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("C:/dj/test.txt");
		BufferedReader in = new BufferedReader(fr);
		String str;
		while ((str = in.readLine()) != null ) {
			System.out.println(str);			
		}
		System.out.println(str); // print "null"
	}

}
