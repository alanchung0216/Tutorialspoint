package com.tutorialspoint.Arrays;

import java.util.ArrayList;

public class Array_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"hello", "world", "good", "morning"};
		for (int i=0; i<str.length ; i++){
			System.out.println(str[i]);
		}
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("hello");
		alist.add("world");
		alist.add("good");
		alist.add("morning");
		System.out.println(alist);
	}

}
