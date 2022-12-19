package com.writtenAssignment;

public class PrintEvenNumber {

	public static void main(String[] args) {
		// 4) WAP to print even numbers from 121 to 229 using while loop. 
		
		int num1=121, num2=229;
		  System.out.println("List of even number from 121 to 229 are:");
		  
	    while(num1<=num2) 
	   {
	     if (num1%2==0)
	       System.out.print(num1+ "  " );
	     num1++; 
	    }
	}
}
