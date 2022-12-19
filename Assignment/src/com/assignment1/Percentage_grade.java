package com.assignment1;
import java.util.Scanner;

public class Percentage_grade {

	public static void main(String[] args) {
		
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
		
		System.out.println("Total: " +total+", "    + "Average: " +average+ ", "   + " Percentage: " +percentage+ "%");
		
				// To Calculate grade.
		System.out.print("Grade: ");
		
		if( percentage >= 75 && percentage<100)
			System.out.print("First Class");
		
		else if (percentage > 60 && percentage < 75)
			System.out.print("Second Class");
		
		else if (percentage <60)
			System.out.print("Third Class");
		
		sc.close();
		

	}

}
