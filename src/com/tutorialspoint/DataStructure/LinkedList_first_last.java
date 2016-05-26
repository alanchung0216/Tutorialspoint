package com.tutorialspoint.DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class LinkedList_first_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List list = new ArrayList();	
		// you can use generic List<T> too
		List<String> list = new ArrayList<String>();
		// List is interface, so we actually calling add method in ArrayList class
		// so why not use ArrayList?
		// ArrayList<String> list = new ArrayList<String>();
		// because List gives you flexibility, you can change it to LinkedList easily later
		
		list.add("hello"); 
		list.add("world");
		list.add("good");
		list.add("morning");
		
		// change List to LinkedList
		LinkedList lnk = new LinkedList();
		// you can use generic LinkedList<T> too
		//LinkedList<String> lnk = new LinkedList<String>();		
		lnk.addAll(list);
		System.out.println(lnk);
		System.out.println(lnk.getFirst());
		System.out.println(lnk.getLast());	
		
		// here you can use Collections class (note this is not Collection interface)
		Collections.reverse(list);
		System.out.println("reversed list " + list);
	}

}
