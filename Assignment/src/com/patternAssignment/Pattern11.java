package com.patternAssignment;

public class Pattern11 {

	public static void main(String[] args) {

		int i, j;

		for (i = 1; i <= 6; i++) {
			char ch = 'A';
				for(j=i;j<=6;j++) {
					System.out.print(ch+" ");
					ch++;
				}
			
				System.out.println();
		}

		for (i = 1; i <= 6; i++) {
			char ch = 'A';
				
			
				for(j=1;j<=i;j++) {
					System.out.print(ch+" ");
					ch++;
				}
				System.out.println();
		}

	}

}
