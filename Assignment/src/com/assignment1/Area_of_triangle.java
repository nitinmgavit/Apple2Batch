package com.assignment1;
import java.util.Scanner;

public class Area_of_triangle {

	public static void main(String[] args) {
		
		// Area of triangle
		
	  double b, h, area; // base, height
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the base of triangle B: ");
	  b=sc.nextDouble();
	  
	  System.out.print("Enter the height of triangle H: ");
	  h=sc.nextDouble();
	  
		area = 0.5 * b * h;
		System.out.println("Area of triangle is : " + area);
		
           sc.close();
	}

}

	
