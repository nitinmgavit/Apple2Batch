package demo;

import java.util.Scanner; // package

public class SumOf_N_numbers { // class

	public static void main(String[] args) { // function or method
		
		// Print the sum of first N natural number
		  int n;
		  int sum=0; // initialize value of sum is zero
		  
		Scanner sc=new Scanner(System.in); //scanner class
		
		System.out.print("Enter the number N : ");
		 n=sc.nextInt(); 
		
		
		for (int i=0; i<=n; i++) {
			
	      sum=sum+i;    //sum+=i;
		}
		
		System.out.println("Sum of 1st N natural Numbers: " +sum);

		sc.close();
	}
	
}
