package com.patternAssignment;

public class Pattern4 {

	public static void main(String[] args) {
         // 4.
		int i, j;

		for (i = 1; i <= 5; i++) {

			for (j = 1; j <= (i); j++) {

				System.out.print(j);
			}
			for (j = (i - 1); j >= (1); j--) {

				System.out.print(j);

			}
			System.out.println();
		}
		for (i = 1; i <= 5; i++) {

			if (i == 1) {
				continue;
			}
			for (j = 1; j <= (6 - i); j++) {

				System.out.print(j);
			}
			for (j = (5 - i); j >= (1); j--) {

				System.out.print(j);
			}

			System.out.println();
		}
	}
}
