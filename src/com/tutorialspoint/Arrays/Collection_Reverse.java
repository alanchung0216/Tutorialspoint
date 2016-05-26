package com.tutorialspoint.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("s");
		alist.add("d");
		alist.add("h");
		alist.add("w");
		Collections.reverse(alist);
		System.out.println("alist reversed " + alist);
	}

}
