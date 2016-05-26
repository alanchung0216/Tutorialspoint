package com.tutorialspoint.Methods;

public class OverloadMethods {
	OverloadMethods() {
		System.out.println("default constructor");
	}
	OverloadMethods(String s) {
		System.out.println("another constructor");		
	}
	void test(int i){
		System.out.println("test integer " + i);
		
	}
	void test(String s){
		System.out.println("test String " + s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadMethods m1 = new OverloadMethods();
		OverloadMethods m2 = new OverloadMethods("hello world");
		m1.test("hello");
		m2.test(5);

	}

}
