package com.patternAssignment;

public class Pattern17 {

	public static void main(String[] args) {

		int i, j;
		for (i = 1; i <= 6; i++) {
			char ch='F';
			
			for (j = 1; j <= (7-i); j++) {
				System.out.print(ch+" ");
				ch--;

			}
			

			System.out.println();
		}

		

	}

}
