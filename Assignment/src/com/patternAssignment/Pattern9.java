package com.patternAssignment;

public class Pattern9 {

	public static void main(String[] args) {

		int i, j;

		for (i = 1; i <= 9; i++) {

			for (j = (1); j <= (i); j++) {

				System.out.print(" ");

			}
			for (j = 1; j <= (10-i); j++) {

				System.out.print(j);

			}
			for (j = (9-i); j >= 1; j--) {

				System.out.print(j);

			}
			
			System.out.println();

		}
		

	}

}
