package com.assignment2;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
	// 9) Write a program to calculate product of digits of any number.
		
		int num, r;  // r= remainder
		int cf=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num=sc.nextInt();
       while (num!=0)
       {
    	   r=num%10;
          cf=cf*r;
          num=num/10;
       }  
       System.out.println("Product of digits is: " +cf);
       sc.close();
	}

}
