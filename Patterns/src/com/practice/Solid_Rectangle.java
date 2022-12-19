package com.practice;

public class Solid_Rectangle {

	public static void main(String[] args) {
		int n=4;  // i
		int m=5;  // j  * * * * *
// we have to start value i from 1 to n, increment by 1 i.e. i++
// and print * in the  for loop
		
		// outer loop
		for (int i=1; i<=n; i++) {
			
			// inner loop
			for ( int j=1; j<=m; j++) {
				
// we have to print * on same line up to m so we have to take print not println
// after printing m star we have go to the next line.
			System.out.print("*");
				
			}
			// we have to print * on next line
			System.out.println();				
		}
		
	}

}    

