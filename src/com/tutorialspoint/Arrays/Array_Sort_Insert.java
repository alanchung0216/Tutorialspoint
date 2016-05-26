package com.tutorialspoint.Arrays;

import java.util.Arrays;

public class Array_Sort_Insert {
	public static void main (String[] args) throws Exception {
		int[] array = {7,4,8,2,5};
		Arrays.sort(array);
		for (int i=0; i<array.length; i++){
			System.out.println("sort array " + i + " " + array[i]);
		}
		int[] array1 = new int[array.length+1];
		
		for (int i=0; i<array.length; i++){
			array1[i] = array[i];
		}
		try {
			array1[array.length]=33;
		}
		catch (Exception e) {
			System.out.println("error");
		}
	
		for (int i=0; i<array1.length; i++){
			System.out.println("insert array " + i + " " + array1[i]);
		}
		
	}

}
