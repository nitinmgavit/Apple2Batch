package com.patternAssignment;

public class Pattern2 {

	public static void main(String[] args) {
        // 2.
		int i, j;

		for (i = 1; i <= 5; i++) {
			if (i == 5) {
				continue;
			}
			for (j = 1; j <= (i); j++) {
				System.out.print(j);
			}

			System.out.println();

		}
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= (6 - i); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
