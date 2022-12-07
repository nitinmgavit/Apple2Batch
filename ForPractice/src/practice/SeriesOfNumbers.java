package practice;

//import java.util.Scanner;

public class SeriesOfNumbers {

	public static void main(String[] args) {
          	// Print series 
		
		for(int i=1; i<=5; i++) {
			System.out.print(i*i +", ");  // 1, 4, 9, 16, 25 		
		   }
		
		
			System.out.println();
			for(int j=1; j<=5; j++) {
				System.out.print(j*j+2 +", ");  //  3,  6,  11, 18, 27
			}	
			
			
			System.out.println();
			for(int k=1; k<=5; k++) {
				System.out.print(k*k*k +", ");   // 1, 8, 27,  64, 125
			}
			
			
			System.out.println();
			for(int l=1; l<=5; l++) {
				System.out.print(l*l+1 +", ");   // 2  5  10  17  26 				
			}
			
			
			System.out.println();
			for(int m=5; m>=1; m--) {
				System.out.print(m +", ");
			}
			
			
			System.out.println();
			for(int n=5; n>=1; n--) {          // 5        4      3
				System.out.print(n*2 +", ");  //5*2=10   4*2=8   3*2=6  
			}
			
			
			System.out.println();
			for(int p=6; p>=1; p--) {           //  6       5        4
				System.out.print(p*5 +", ");    //6*5=30   5*5=25   4*5=20
				                         // 30  25  20  15  10  5
			}
					
			
			
			
												
	}
	
}
