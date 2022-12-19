package com.writtenAssignment;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		// 1. Write a program to calculate product of digits of any number.
		
		int num, pro=1;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		int rem;
		for(pro=1; num!=0; num=num/10)		
		{
		   rem=num%10;    
		   pro=pro*rem;   	   
		}
		 
		System.out.println("Product of digits are: " +pro);		
		sc.close(); 

	}

}
