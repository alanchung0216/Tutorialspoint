package com.tutorialspoint.Arrays;

public class Array_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={5,7,2,4,1};
		int[] array1 = new int[array.length];
		for (int i=0, j=array.length-1; i < array.length; i++, j--){
			array1[j]= array[j];
			System.out.println(array[j]);
		}
	}

}
