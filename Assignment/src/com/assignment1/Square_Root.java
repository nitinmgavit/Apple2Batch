package com.assignment1;
import java.util.Scanner;

public class Square_Root {

	public static void main(String[] args) {
		
		// Calculate the square root of any number.
		
		int x;
		double root;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter a number X: ");
		 x=sc.nextInt();
		 
		 root=Math.sqrt(x);
		 System.out.println("The square root of X is: " +root);
		 
		 sc.close();

	}

}
