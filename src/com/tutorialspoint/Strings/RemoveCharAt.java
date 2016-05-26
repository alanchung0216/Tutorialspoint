/*
 * How to remove a particular character from a string ?
 */
package com.tutorialspoint.Strings;

public class RemoveCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello world";
		
		String toremove="w";
		int index=0;
		for (int i = 0; i < str.length(); i++){
			if (toremove.equals(str.substring(i,i+1))) {
				index=i;
				break;
			}
		}
		String str1=str.substring(0,index)+str.substring(index+1,str.length());
		System.out.println("string is now " + str1);
	}

}
