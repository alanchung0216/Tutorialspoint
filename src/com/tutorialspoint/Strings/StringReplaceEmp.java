/*
 * How to replace a substring inside a string by another one ?
 */
package com.tutorialspoint.Strings;

public class StringReplaceEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world good morning";
		String str1 = str.replace('w', 'h');
		String str2 = str.replace("world", "usa");
		System.out.println(" str1= "+ str1);
		System.out.println(" str2= "+ str2);
//	      String str="Hello World";
//	      System.out.println( str.replace( 'H','W' ) );
//	      System.out.println( str.replaceFirst("He", "Wa") );
//	      System.out.println( str.replaceAll("He", "Ha") );

	}

}
