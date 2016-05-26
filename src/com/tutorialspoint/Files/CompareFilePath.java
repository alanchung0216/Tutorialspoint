package com.tutorialspoint.Files;

import java.io.File;

public class CompareFilePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fp1 = new File("C:/test1/www");
		File fp2 = new File("C:/test1");
		if (fp1.compareTo(fp2) == 0) {
			System.out.println("they are the same");
		} else {
			System.out.println("they are different");
		}

	}

}
