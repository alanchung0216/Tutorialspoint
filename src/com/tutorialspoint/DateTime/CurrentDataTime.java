/*
 * How to display current date and time?
 * This example shows how to display the current 
 * date and time using Calender.getInstance() method of 
 * Calender class and fmt.format() method of Formatter class.
 */
package com.tutorialspoint.DateTime;

import java.util.Calendar;
import java.util.Formatter;

public class CurrentDataTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		Formatter fmt = new Formatter();
		fmt.format("%tc", cal);
		System.out.println(fmt);
	//How to display hour and minute (current time)?
		fmt.format(" %tl:%tM", cal, cal);
		System.out.println(fmt);

	}

}
