package com.tutorialspoint.Files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:/dj/test1.txt");
		try {
			if (f.createNewFile()) {
				System.out.println(" file created");			
			}
			else {
				System.out.println(" file already existed");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
