package com.pactice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10, firstT=0, secondT=1;
		System.out.println("Fibonacci Series till 10 terms: ");
		
		for(int i=1; i<=n; i++) {
			System.out.print(firstT+", ");
			
			// Compute the next term
			int nextT = firstT + secondT;
			firstT = secondT;
			secondT = nextT;
			
		}

	}

}
