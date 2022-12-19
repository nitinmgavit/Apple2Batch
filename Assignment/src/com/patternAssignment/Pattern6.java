package com.patternAssignment;

public class Pattern6 {

	public static void main(String[] args) {
        // 6
		int i, j;
		for (i = 1; i <= 7; i++) {

			for (j = 1; j <= (8-i); j++) {

				System.out.print(" ");
			}
			for (j = 1; j <= (i); j++) {

				System.out.print(j+" ");
			}
			
			System.out.println();

		}	
	}

}
