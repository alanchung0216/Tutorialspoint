package com.tutorialspoint.JavaPractice;

public class DateTime {

	public static void main(String[] args) {
	      /*
	       * Date Formatting using SimpleDateFormat:

			SimpleDateFormat is a concrete class for formatting and parsing dates 
			in a locale-sensitive manner. SimpleDateFormat allows you to start by 
			choosing any user-defined patterns for date-time formatting. For example:
			
			import java.util.*;
			import java.text.*;
			
			public class DateDemo {
			   public static void main(String args[]) {
			
			      Date dNow = new Date( );
			      SimpleDateFormat ft = 
			      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
			
			      System.out.println("Current Date: " + ft.format(dNow));
			   }
			}
			
			This would produce the following result:

				Current Date: Sun 2004.07.18 at 04:14:09 PM PDT
				
			Simple DateFormat format codes:

To specify the time format, use a time pattern string. In this pattern, all ASCII letters 
are reserved as pattern letters, which are defined as the following:

Character	Description	Example
G	Era designator	AD
y	Year in four digits	2001
M	Month in year	July or 07
d	Day in month	10
h	Hour in A.M./P.M. (1~12)	12
H	Hour in day (0~23)	22
m	Minute in hour	30
s	Second in minute	55
S	Millisecond	234
E	Day in week	Tuesday
D	Day in year	360
F	Day of week in month	2 (second Wed. in July)
w	Week in year	40
W	Week in month	1
a	A.M./P.M. marker	PM
k	Hour in day (1~24)	24
K	Hour in A.M./P.M. (0~11)	10
z	Time zone	Eastern Standard Time
'	Escape for text	Delimiter
"	Single quote	`



		Date Formatting using printf:

			Date and time formatting can be done very easily using printf method. 
			You use a two-letter format, starting with t and ending in one of the 
			letters of the table given below. For example:
			
			import java.util.Date;
			
			public class DateDemo {
			
			public static void main(String args[]) {
			   // Instantiate a Date object
			   Date date = new Date();
			
			   // display time and date using toString()
			   String str = String.format("Current Date/Time : %tc", date );
			
			   System.out.printf(str);
			}
			}
			
			This would produce the following result:
			
			Current Date/Time : Sat Dec 15 16:37:57 MST 2012
			
			
			It would be a bit silly if you had to supply the date multiple times to 
			format each part. For that reason, a format string can indicate the index 
			of the argument to be formatted.

			The index must immediately follow the % and it must be terminated by a $. For example:

			import java.util.Date;
			
			public class DateDemo {
			
			 public static void main(String args[]) {
			     // Instantiate a Date object
			     Date date = new Date();
			      
			     // display time and date using toString()
			     System.out.printf("%1$s %2$tB %2$td, %2$tY", 
			                       "Due date:", date);
			 }
			}
			
			This would produce the following result:
			
					Due date: February 09, 2004
			
			
			Alternatively, you can use the < flag. It indicates that the same argument 
			as in the preceding format specification should be used again. For example:

			import java.util.Date;
			
			public class DateDemo {
			
			 public static void main(String args[]) {
			     // Instantiate a Date object
			     Date date = new Date();
			      
			     // display formatted date
			     System.out.printf("%s %tB %<te, %<tY", 
			                       "Due date:", date);
			 }
			}
				This would produce the following result:
				
				Due date: February 09, 2004

Date and Time Conversion Characters:

Character	Description	Example
c	Complete date and time	Mon May 04 09:51:52 CDT 2009
F	ISO 8601 date	2004-02-09
D	U.S. formatted date (month/day/year)	02/09/2004
T	24-hour time	18:05:19
r	12-hour time	06:05:19 pm
R	24-hour time, no seconds	18:05
Y	Four-digit year (with leading zeroes)	2004
y	Last two digits of the year (with leading zeroes)	04
C	First two digits of the year (with leading zeroes)	20
B	Full month name	February
b	Abbreviated month name	Feb
m	Two-digit month (with leading zeroes)	02
d	Two-digit day (with leading zeroes)	03
e	Two-digit day (without leading zeroes)	9
A	Full weekday name	Monday
a	Abbreviated weekday name	Mon
j	Three-digit day of year (with leading zeroes)	069
H	Two-digit hour (with leading zeroes), between 00 and 23	18
k	Two-digit hour (without leading zeroes), between 0 and 23	18
I	Two-digit hour (with leading zeroes), between 01 and 12	06
l	Two-digit hour (without leading zeroes), between 1 and 12	6
M	Two-digit minutes (with leading zeroes)	05
S	Two-digit seconds (with leading zeroes)	19
L	Three-digit milliseconds (with leading zeroes)	047
N	Nine-digit nanoseconds (with leading zeroes)	047000000
P	Uppercase morning or afternoon marker	PM
p	Lowercase morning or afternoon marker	pm
z	RFC 822 numeric offset from GMT	-0800
Z	Time zone	PST
s	Seconds since 1970-01-01 00:00:00 GMT	1078884319
Q	Milliseconds since 1970-01-01 00:00:00 GMT
	       */
	}

}
