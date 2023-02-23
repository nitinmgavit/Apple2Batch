package com.patternAssignment;

public class Pattern15 {

	public static void main(String[] args) {

		int i, j;
		for (i = 1; i <= 5; i++) {

			for (j = 1; j <= i; j++) {
				System.out.print(" ");

			}
			for (j = (i); j <= (5); j++) {
				System.out.print(j + " ");

			}

			System.out.println();
		}

		for (i = 1; i <= 5; i++) {
			if(i==1) {
				continue;
			}
			for (j = (i); j <= (5); j++) {
				System.out.print(" ");
				

			}
			for (j = (6-i); j <= 5; j++) {
				System.out.print(j + " ");

			}
			

			System.out.println();
		}

	}

}
