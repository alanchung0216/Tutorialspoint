package com.tutorialspoint.DataStructure;

import java.util.Collections;
import java.util.Vector;

public class VectorSearch {

		public static void main(String[] args) {
			Vector<String> vs = new Vector<String>();
			vs.add("hello");
			vs.add("world");
			vs.add("good");
			vs.add("morning");
			Collections.sort(vs);
			System.out.println("found index " + Collections.binarySearch(vs, "world"));
			// swap two elements
			Collections.swap(vs, 2, 3);
			System.out.println("swap "+ vs);
			
		}
}
