package demo;

// if else code

import java.util.Scanner; // package 

public class Conditional_st3 { // class
	public static void main(String args[]) { // function or method

	/* 
		 if given condition is true if block will be execute otherwise else
		
		 in if_else conditional statement both condition will be check and the run/ execute the code
	 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();

		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();

		if (a == b) {
			System.out.println("Equal");
		} else {
			
			if (a > b) {
				System.out.println("Value is greater");
				
			} else {
				System.out.println("Value is lesser");
			}
			sc.close();
		}

	}

}
