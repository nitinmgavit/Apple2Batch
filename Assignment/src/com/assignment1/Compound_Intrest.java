package com.assignment1;
import java.util.Scanner;

public class Compound_Intrest {

	public static void main(String[] args) {
		
		// Calculate compound intrest using P, T, R.
		
		double p, r, t, ci;
		
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.print("Enter the principle : ");
		 p=sc.nextDouble();
		 
		 System.out.print("Enter the rate: ");
		 r=sc.nextDouble();
		 
		 System.out.print("Enter the time: ");
		 t=sc.nextDouble();
		 
		// compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle
		 
		 ci = p * (Math.pow(( 1+ r / 100),t )) - p;
		 System.out.println("Compound Intrest: " +ci);
		 
		 sc.close();
		 
	}
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		

	

