package com.patternAssignment;

public class Pattern20 {

	public static void main(String[] args) {

		int i, j,k;
		for(i=1;i<=5;i++) {
			for(j=1;j<=(5-i);j++) {
				System.out.print("1"+" ");
			}
			for(j=(i);j<=(i);j++) {
				for(k=0;k<=j-1;k++) {
					System.out.print(i+" ");
				}
				
			}
			
			System.out.println();
		}
		
	}

}
