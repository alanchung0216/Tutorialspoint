package com.tutorialspoint.Directories;

import java.io.File;

public class ListDirectories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fh = new File("C:/dj");
		if (fh.exists()) {
			System.out.println("directory name - " + fh.getName());
			for (int i = 0; i < fh.listFiles().length; i++) {
				System.out.println("list files " + fh.listFiles()[i]);
			}

		}
	}

}
