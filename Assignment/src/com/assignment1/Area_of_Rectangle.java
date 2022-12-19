package com.assignment1;
import java.util.Scanner;

public class Area_of_Rectangle {

	public static void main(String[] args) {
		
	// by using length and breadth of rectangle find the area.
		
		int length, breadth, area;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the length: ");
		length=sc.nextInt();
		
		System.out.print("Enter the breadth: ");
		breadth=sc.nextInt();
		
		area= length * breadth ;
		System.out.println("Area of Rectangle: " +area);
		
		sc.close();

	}

}
