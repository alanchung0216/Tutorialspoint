/*
 * How to reverse a String?
 */
package com.tutorialspoint.Strings;

public class StringReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Hello World";
		String str1;
		str1 = new StringBuffer(str).reverse().toString();
		System.out.println("str1 = "+str1);
		

	}

}
