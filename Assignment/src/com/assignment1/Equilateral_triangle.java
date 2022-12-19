package com.assignment1;
import java.util.Scanner;

public class Equilateral_triangle {

	public static void main(String[] args) {
		
		// calculate area of an equilateral triangle
		
		double side, area;  
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Side of triangle: ");
		side=sc.nextDouble();
		
		area = 0.43 * side * side;   // A= root3/4 *s^2
		System.out.println("Area of equilateral triangle: " +area);
		
		sc.close();
	}

}
