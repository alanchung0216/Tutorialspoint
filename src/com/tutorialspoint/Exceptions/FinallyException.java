package com.tutorialspoint.Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FinallyException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			File fh = new File("C:/dje");
			FileReader fr = new FileReader(fh);
			//BufferedReader in = new BufferedReader(fr);
			throw new IllegalArgumentException("bad type");
			//String str = in.readLine();
			//System.out.println("readLine!!!");
		} catch (IllegalArgumentException e) {
			System.err.println("Error: ("+ e.getMessage()+").");
            return;  
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException!!!"+ e.getMessage()+").");
			return;
		}
		finally {
			System.out.println("finally exception!!!");
		}
		//System.out.println("normal exit!!!");
	}
	
}
