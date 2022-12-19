package com.assignment1;
import java.util.Scanner;

public class Simple_Intrest_ {

	public static void main(String[] args) {
		
		// Write a java program to enter P, R, T and calculate simple intrest.
		
		Scanner sc=new Scanner(System.in);
		
		double p, r, t, si;
		
		System.out.println("Enter the values");
		
		System.out.print("Principle: "  );
		p=sc.nextDouble();
		
		System.out.print("Rate : "  );
		r=sc.nextDouble();
		
		System.out.print("Time: "  );
		t=sc.nextDouble();
		
		// standard formula
		
		si=(p*r*t)/100;
		System.out.println("Simple intrest is: " +si);
		
		sc.close();
		
	}

}
