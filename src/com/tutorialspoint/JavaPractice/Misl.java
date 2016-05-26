package com.tutorialspoint.JavaPractice;

import java.util.Arrays;

public class Misl {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// instanceof operator
	      String name = "James";
	      // following will return true since name is type of String
	      boolean result = name instanceof String;  
	      
	   /* Numbers Class
	      Normally, when we work with Numbers, we use primitive data types 
	      such as byte, int, long, double, etc.
	      However, in development, we come across situations where we need to 
	      use objects instead of primitive data types. In-order to achieve this 
	      Java provides wrapper classes
			All the wrapper classes (Integer, Long, Byte, Double, Float, Short) 
			are subclasses of the abstract class Number.
		*/
	      Integer x = 5; // boxes int 5 to an Integer object
	      x =  x + 10;   // unboxes the Integer to a int 
	      
	      /*
	       * 
	      xxxValue()
	      Converts the value of this Number object to the xxx data type and returned it.
	      
	      compareTo()
	      Compares this Number object to the argument.

	      equals()
	      Determines whether this number object is equal to the argument.

	      valueOf()
	      Returns an Integer object holding the value of the specified primitive.

	      toString()
	      Returns a String object representing the value of specified int or Integer.

	      parseInt()
	      This method is used to get the primitive data type of a certain String.
	      */
	      /*
	      Declaring an array variable, creating an array, and assigning the 
	      reference of the array to the variable can be combined in one statement, 
	      as shown below:

	    	  dataType[] arrayRefVar = new dataType[arraySize];
	    	  Alternatively you can create arrays as follows:

	    	  dataType[] arrayRefVar = {value0, value1, ..., valuek};
	    	  The array elements are accessed through the index. Array indices 
	    	  are 0-based; that is, they start from 0 to arrayRefVar.length-1.
	    	  
	      // foreach loop
	      double[] myList = {1.9, 2.9, 3.4, 3.5};

	      // Print all the array elements
	      for (double element: myList) {
	         System.out.println(element);
	      }
	      /*
	      Passing Arrays to Methods:

	    	  Just as you can pass primitive type values to methods, you can
	    	   also pass arrays to methods. For example, the following method 
	    	   displays the elements in an int array:

	    	  public static void printArray(int[] array) {
	    	    for (int i = 0; i < array.length; i++) {
	    	      System.out.print(array[i] + " ");
	    	    }
	    	  }
	    	  You can invoke it by passing an array. For example, 
	    	  the following statement invokes the printArray method 
	    	  to display 3, 1, 2, 6, 4, and 2:

	    	  printArray(new int[]{3, 1, 2, 6, 4, 2});
	    	  */
	      /*
	      Returning an Array from a Method:

	    	  A method may also return an array. For example, the method shown below returns an array that is the reversal of another array:

	    	  public static int[] reverse(int[] list) {
	    	    int[] result = new int[list.length];

	    	    for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
	    	      result[j] = list[i];
	    	    }
	    	    return result;
	    	  }
	        */
	      
	      /*
	      The following program displays all of the command-line arguments that
	       it is called with:

	    	  public class CommandLine {

	    	     public static void main(String args[]){ 
	    	        for(int i=0; i<args.length; i++){
	    	           System.out.println("args[" + i + "]: " +
	    	                                             args[i]);
	    	        }
	    	     }
	    	  }
	    	  Try executing this program as shown here:

	    	  $java CommandLine this is a command line 200 -100
	    	  
	    	  This would produce the following result:

					args[0]: this
					args[1]: is
					args[2]: a
					args[3]: command
					args[4]: line
					args[5]: 200
					args[6]: -100
					
	The Arrays Class:

		The java.util.Arrays class contains various static methods for 
		sorting and searching arrays, comparing arrays, and filling 
		array elements. 
				
			import java.util.Arrays;				
				double[] myList = {1.9, 2.9, 3.4, 3.5};
				Arrays.sort(myList);  //Arrays static method sort the myList array
	    */
	     /* 
	      In general the keyword "this" is used to :
	    	  Differentiate the instance variables from local variables 
	    	  if they have same names, within a constructor or a method.

	    	  class Student{

	    	     int age;   
	    	     Student(int age){
	    	     this.age=age;	
	    	     }

	    	  }
	    	  
	  	Call one type of constructor( parametrized constructor or default ) from 
	  	other in a class. It is known as explicit constructor invocation .

				class Student{
				
				   int age
				   Student(){
				   this(20);  //call parametrized constructor below
				   }
				   
				   Student(int age){
				   this.age=age;	
				   }
				
				}
	    	  */
	      
	      /*
	       * Variable Arguments(var-args):

				JDK 1.5 enables you to pass a variable number of arguments of 
				the same type to a method. The parameter in the method is 
				declared as follows:
				
				typeName... parameterName
				In the method declaration, you specify the type followed by 
				an ellipsis (...) Only one variable-length parameter may be 
				specified in a method, and this parameter must be the last 
				parameter. Any regular parameters must precede it.
				
				Example:
				
				public class VarargsDemo {
				
				   public static void main(String args[]) {
				      // Call method with variable args  
					  printMax(34, 3, 3, 2, 56.5);
				      printMax(new double[]{1, 2, 3});
				   }
				
				   public static void printMax( double... numbers) {
				   if (numbers.length == 0) {
				      System.out.println("No argument passed");
				      return;
				   }
				
				   double result = numbers[0];
				
				   for (int i = 1; i <  numbers.length; i++)
				      if (numbers[i] >  result)
				      result = numbers[i];
				      System.out.println("The max value is " + result);
				   }
				}
				This would produce the following result:
				
				The max value is 56.5
				The max value is 3.0
					       * 
					       */
	      /*
	       *The finalize( ) Method:

			It is possible to define a method that will be called just before an 
			object's final destruction by the garbage collector. This method is 
			called finalize( ), and it can be used to ensure that an object 
			terminates cleanly.
			
			For example, you might use finalize( ) to make sure that an open 
			file owned by that object is closed.
			
			To add a finalizer to a class, you simply define the finalize( ) method. 
			The Java runtime calls that method whenever it is about to recycle 
			an object of that class.
			
			Inside the finalize( ) method, you will specify those actions that
			 must be performed before an object is destroyed.

			The finalize( ) method has this general form:
	    
	      The finalize( ) method has this general form:

	    	  protected void finalize( )
	    	  {
	    	     // finalization code here
	    	  }
	    	  
	    	  */
	      

	}

}
