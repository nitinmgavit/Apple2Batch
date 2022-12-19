package com.assignment1;
import java.util.Scanner;

public class Find_Perimeter {

	public static void main(String[] args) {
		
		// By using length and breadth of rectangle find its perimeter.
		
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
