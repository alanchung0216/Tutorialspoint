/*
 * How to compare two strings ?
 */
package com.tutorialspoint.Strings;

public class StringCompareEmp {

	public static void main(String[] args) {
		
		String str1 = "Hello World";
		String str2 = "Hello world";		

		if (str1.equals(str2)) {
			System.out.println("equals true- they are same");
		} else {
			System.out.println("equals false- they are different");			
		}
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("equalsIgnoreCase true - they are same");
		} else {
			System.out.println("equalsIgnoreCase false - they are different");			
		}
	}
}
