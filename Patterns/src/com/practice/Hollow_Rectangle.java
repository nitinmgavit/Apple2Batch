package com.practice;

public class Hollow_Rectangle {

	public static void main(String[] args) {
		
		int n=4; // row     --> i
		int m=5; // column  * * * * * --> j
		
		//outer loop
		for (int i=1; i<=n; i++) { // i is a counter variable.
			
			//inner loop
			for (int j=1; j<=m; j++) {
				if (i==1 || j==1 || i==n || j==m) {  
					
					System.out.print("*");
				} else {
					
			 // this empty string quote is to print the * at  (i=2,j=5) and (i=3,j=5) and 
			// get space at middle rows and columns. 
					
					System.out.print(" "); 
				}
						
			}
			System.out.println();
		}

	}

}

/*
 
 *****
 *   *
 *   *  
 *****
 
 */
