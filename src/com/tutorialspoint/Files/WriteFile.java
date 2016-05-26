package com.tutorialspoint.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		FileWriter fw;
		try {
			fw = new FileWriter("C:/dj/test1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.close(); // need this line to have write data onto file
			System.out.println("write successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
