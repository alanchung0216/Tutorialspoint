package com.tutorialspoint.Arrays;

import java.util.Arrays;



public class Array_Sort_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {7, 4, 66, 2, 9};
		for (int i=0; i<array.length; i++){
			for (int j=i+1; j<array.length; j++){
				int temp;
				if (array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for (int i=0; i<array.length; i++){
			System.out.println("sort array " + i + " " + array[i]);
			
		}
		for (int i=0; i<array.length; i++){
			if (array[i] == 9){
				System.out.println("found it " + array[i]);
			}
		}
		Integer[] array1 = {7, 4, 66, 2, 9};
		Arrays.sort(array1);
		for (int i=0; i<array1.length; i++){
				System.out.println("array1 sorted  " + array1[i]);
		}
		int index = Arrays.binarySearch(array1, 66);
		System.out.println("found it " + array1[index]);
		
	}

}
