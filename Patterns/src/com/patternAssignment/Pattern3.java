package com.patternAssignment;

public class Pattern3 {

	public static void main(String[] args) {
         // 3.
		int i, j;
		for (i = 1; i <= 10; i++) {
			if (!(i % 2 == 0)) {
				if (i == 5) {
					continue;
				}
				for (j = 1; j <= (i); j++) {

					System.out.print(j);

				}
				System.out.println();
			}

		}
		for (i = 1; i <= 5; i++) {
			if (!(i % 2 == 0)) {
				for (j = 1; j <= (6 - i); j++) {

					System.out.print(j);
				}

				System.out.println();
			}
		}
	}

}
