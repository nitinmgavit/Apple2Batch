package com.patternAssignment;

public class Pattern10 {

	public static void main(String[] args) {

		int i, j;

		for (i = 1; i <= 9; i++) {

			for (j = 1; j <= (10-i); j++) {

				System.out.print(" ");

			}
			for (j = (10-i); j <=9; j++) {

				System.out.print(j);

			}
	
			for (j = 8; j >= (10-i); j--) {

				System.out.print(j);

			}
			
			System.out.println();

		}
		

	}

}
