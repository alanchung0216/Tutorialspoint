package com.tutorialspoint.Exceptions;

public class ChainedException {

	public static void main(String[] args) {

		try {
			int result = 20/0;
			System.out.println("result is "+result);
		} catch (Exception e) {
			try {
				System.out.println("its Exception!!!");
				throw new RuntimeException("RuntimeException!!!");
			} catch (RuntimeException e2) {
				System.out.println("throw manually - "+e2);
			}
			
		}

	}

}
