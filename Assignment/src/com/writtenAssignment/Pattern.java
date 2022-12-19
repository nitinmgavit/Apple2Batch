package com.writtenAssignment;

public class Pattern {
	
	// 2) Draw the patterns create a separate method for each:
	
	void starPattern() {
		 
	for(int i=1; i<=4; i++) {
		
		for(int j=1; j<=i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}	
 }	
	
	void numberPattern() {
		
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				
				if(i%2==0)
				System.out.print("0 ");
				else 
					System.out.print("1 ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
			
		Pattern p= new Pattern();
		p.starPattern();
		p.numberPattern();	
	}

}
