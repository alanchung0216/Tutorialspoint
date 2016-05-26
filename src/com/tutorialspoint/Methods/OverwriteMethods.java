package com.tutorialspoint.Methods;

class Car1 {
	public void paint(String s) {
		System.out.println("color " + s);
	}
}	

class RedCar1 extends Car1 {
	public void paint(String s) {
		System.out.println("color " + s);
	}
}

public class OverwriteMethods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RedCar1 rc = new RedCar1();
		rc.paint("red");

	}

}
