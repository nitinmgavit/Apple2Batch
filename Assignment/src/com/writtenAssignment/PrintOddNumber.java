package com.writtenAssignment;

public class PrintOddNumber {

	public static void main(String[] args) {
		// 3) WAP to print odd numbers from 521 to 229 using while loop. 
		
	    int num1=521, num2=229;
		  System.out.println("List of odd number from 521 to 229 are:");
		   
		while(num1>=num2) 
		   {
		      if(num1%2!=0)      //(521%2 = !(false) = true) //if(!(num1%2==0))
		         
			System.out.print(num1+" ");		
		      num1--;
	   }
	}
}
