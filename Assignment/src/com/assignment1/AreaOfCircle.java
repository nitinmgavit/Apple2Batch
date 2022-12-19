package com.assignment1;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		// 1) Write a java program to calculate area of circle.
		
		Scanner sc=new Scanner(System.in);
		
		int radius;
		double pi= 3.14, area;
		
		System.out.print("Enter the radius of circle : ");
		 radius =sc.nextInt();
		 
		area = pi * radius * radius ;
		System.out.println("Area of circle :" +area);
		
		sc.close();
	}

}
