package com.practice;

public class Half_Pyramid {

	public static void main(String[] args) {
		// Print Half pyramid.		
		
		int n=4;
		
		for (int i=1; i<=n; i++) {   //  this line print -> * * * *  
			
			for (int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.println();		
		}	
    }
} 


/*
     j=1 so it will print * for 1st line then 
     j=2 (j++ increment) so it will print * * for 2nd line (it will print star and space also between two star)
     j=3  * * *
     j=4  * * * *
 
	 1st row -> print 1 star
	 2nd row -> print 2 star
	 similarly....
	 and Row number is equal to total columns
		 
 
 *
 **
 ***
 ****
 
 */
