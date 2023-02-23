package com.patternAssignment;

public class Pattern14 {

	public static void main(String[] args) {

		int i, j;

		for (i = 1; i <= 5; i++) {

			for (j = 1; j <= 6 - i; j++) {
				System.out.print(" ");

			}
			for (j = 1; j <= i; j++) {
				System.out.print("*" + " ");

			}

			System.out.println();
		}

		for (i = 1; i <= 5; i++) {
			if(i==1) {
				continue;
			}
			for (j = 1; j <= i; j++) {
				System.out.print(" ");

			}
			for (j = 1; j <= 6 - i; j++) {
				System.out.print("*" + " ");
				

			}

			System.out.println();
		}



	}

}
