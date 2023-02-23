package com.patternAssignment;

public class Pattern19 {

	public static void main(String[] args) {

		int i, j;
		for (i = 1; i <= 6; i++) {
			if (i % 2 == 0) {
			for (j = 1; j <= (6); j++) {
				if(j%2==0) {
					System.out.print("1" + " ");
				}else {
					System.out.print("0" + " ");
				}
					
				} 
			System.out.println();
				
			}else {
				for (j = 1; j <= (6); j++) {
					if(j%2==0) {
						System.out.print("0" + " ");
					}else {
						System.out.print("1" + " ");
					}
						
					} 
				System.out.println();
			}
			

		}

	}

}
