package com.tutorialspoint.Files;

import java.io.File;

public class GetFileSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fh = new File("C:/dj/test.txt");
		if (fh.exists()) {
			System.out.println("FIle size " + fh.length());
		} else
			System.out.println("FIle not exist");
	}

}
