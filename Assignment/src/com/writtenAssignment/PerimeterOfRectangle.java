package com.writtenAssignment;

import java.util.Scanner;

public class PerimeterOfRectangle {
	
     public static void main(String[] args) {  	 
   // 1)Write a Java program to enter length and breadth of a rectangle and find its perimeter.
    	 
        int length, breadth, perimeter;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the length:");
	     length=sc.nextInt();
	    System.out.print("Enter the breadth:");
		 breadth=sc.nextInt();
		 
		 perimeter= 2 * (length * breadth);
		System.out.println("Perimeter of rectangle is : " +perimeter);
		 
		 sc.close();
	}
}
