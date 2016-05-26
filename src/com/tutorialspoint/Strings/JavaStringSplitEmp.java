/*
 * How to split a string into a number of substrings ?
 */
package com.tutorialspoint.Strings;

import java.util.ArrayList;
import java.util.List;

public class JavaStringSplitEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello world good morning";
		String[] str1;
		
		str1 = str.split(" ");
		for (int i=0; i<str1.length; i++){
			System.out.println(str1[i]);
		}
		str1 = str.split("d");
		for (int i=0; i<str1.length; i++){
			System.out.println(str1[i]);
		}
	}
	

}
