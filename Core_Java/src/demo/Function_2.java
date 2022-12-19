package demo;

import java.util.Scanner;

public class Function_2 {
	
	public static void printMyName(String name) { // main function
		
	
		System.out.println(name);
		return;
	}
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		
		printMyName(name); // Called the function.
		
		sc.close();
	}
     
} 

/*  void= return type,
printMyName= functionName -->
 String name= type arg1, type arg2 (i.e. inputs)
 argument will be any type like- int, char, string, boolean, float
 and we can pass multiple arguments.	  
 printMyName- identifier define by user- camel case use in java
*/	

// functions and methods are block of code which perform the operations and takes input from user and give the output.
// but different in between is --> we call the method through object.
// --> and we call the functions directly.	
// so whatever functions we write here we called them functions
// but when we used object of class to the call, so that function we called method.


