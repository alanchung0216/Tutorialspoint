package com.tutorialspoint.Directories;
import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dr = new File("C:/a/b/c");
		if (dr.mkdirs()) {
			System.out.println("created directories");
		}
		
	}

}
