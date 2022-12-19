package com.practice;

public class HP_WithNumbers {

	public static void main(String[] args) {
		
		// Half pyramid with number: 
	
		    int n=5;
			for(int i=1; i<=n; i++){
			
			  for(int j=1; j<=i; j++) {
				
				System.out.print(j);
			}
			System.out.println();			
		}				
	}	 
}
/*
 1
 12
 123
 1234
 12345
 */