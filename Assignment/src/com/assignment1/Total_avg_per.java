package com.assignment1;
import java.util.Scanner;

public class Total_avg_per {

	public static void main(String[] args) {
		
// 10).Write a Java program to enter marks of five subjects and calculate total and Percentage.
		
		Scanner sc=new Scanner(System.in);
		
		double phy, chem, math, bio, eng;
		double total, average, percentage;
		
		System.out.println("Enter the Marks of five subject");
		
		System.out.print("Physics: ");
		phy = sc.nextDouble();
		
		System.out.print("Chemistry: ");
		chem = sc.nextDouble();
		
		System.out.print("Math: ");
		math = sc.nextDouble();
		
		System.out.print("Biology: ");
		bio = sc.nextDouble();
		
		System.out.print("English: ");
		eng = sc.nextDouble();
		
		//Standard formula to calculate Total, Average and Percentage.
		
		total = phy + chem + math + bio + eng;
		average = (total / 5.0);
		percentage = ((total / 500.0) * 100);
		
	//	System.out.println("Total: " +total+ "/500.0");
	//	System.out.println("Average:" +average );
	//	System.out.println("Percentage: " +percentage+ "%");
	//	System.out.println("Total: " +total+", "    + "Average: " +average+ ", "   + " Percentage: " +percentage+ "%");
		System.out.println("Total:" +total+ "  Average:" +average+ "  Percentage:" +percentage+ "%");
		
		sc.close();
		

	}

}
