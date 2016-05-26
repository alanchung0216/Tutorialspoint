package com.tutorialspoint.JavaPractice;

class TestClass{
	int l = Variables.k;
	int getvalue(){
		return Variables.k;
	}
}

public class Variables {
	//instance variables,  defined outside of method.
	int i; // create in heap. int init is default to 0.
			
	String str; // create in heap. String init is default to null.
				// no modifier is default and classes within package 
				//com.tutorialspoint.JavaPractic can access it
	protected String str1; // create in heap. String init is default to null.
				// subclassess or classes within package 
				//com.tutorialspoint.JavaPractic can access it

	public String str2; // all classes can access even outside of the package.
					
	// class/static variables,  defined outside of method. 
	// created in static memory when the program starts. only one copy of this variable
	// access is similar to instance variables. but mostly public so that other classes
	// can use it.
	static int j; // static member
	public static int k; // public static member that other classes can access.
	private static double salary; // only 
	public static final String HEAD ="Header"; // is constant. naming convetion, all upper case
	
	static void getvalue() {
		//Variables.i = 5; // wrong
		Variables.j = 5; // because it's static method so it can only access static member.
		
	}
		
	Variables(){ // constructor
		int i=1; // local variable create on stack, need to init a value when use it
	}
	{// block
		int i=2; // local variable create on stack, need to init a value when use it
		++i;
	}
	public static void main(String[] args) {
		//public int j=2; // wrong, can't not have access modifier. it's private.
		int i=4; // local variable create on stack, need to init a value when use it
		
		Variables.j=10; // OK. can be access by static method main. 
						// j is class variable (static member).
		
		TestClass tc = new TestClass();
		tc.getvalue();	// Accessible static Variables.j because it's public
		
		Variables.salary = 300; // OK, private can be access by static method main.
		

	}

}
