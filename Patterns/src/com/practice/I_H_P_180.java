package com.practice;

public class I_H_P_180 {

	public static void main(String[] args) {
		
		int n=4;
		//outer loop
		for (int i=1; i<=n; i++) {
				
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");  //inner loop-> to print space
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print("*");   //inner loop-> to print star
			}
			System.out.println();
			
		}
		  
	}

}
