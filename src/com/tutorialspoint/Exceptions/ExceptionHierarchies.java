package com.tutorialspoint.Exceptions;

class colorException extends Exception {
	@Override
	public String getMessage(){
		return "colorException!!!";
	}
}
class redcolorException extends colorException {
	@Override
	public String getMessage(){
		return "redcolorException!!!";
	}
}
public class ExceptionHierarchies {

	public static void main(String[] args) {
		try {
			int i=2;
			if (i==0) {
				throw new RuntimeException("RuntimeException!!!");
			} else if (i==1) {
				throw new colorException();
			} else {
				throw new redcolorException();
			}
		} catch (redcolorException e) {			
			System.err.println("Error: ("+ e.getMessage()+").");
			e.printStackTrace();
		} catch (colorException e) {			
			System.err.println("Error: ("+ e.getMessage()+").");
			e.printStackTrace();
		} catch (RuntimeException e) {			
			System.err.println("Error: ("+ e.getMessage()+").");
			e.printStackTrace();
		}
	}

}
