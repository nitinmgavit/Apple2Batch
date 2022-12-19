package com.assignment1;
import java.util.Scanner;

public class Third_Angle {

	public static void main(String[] args) {
	
		// enter the two angle of triangle and find the third angle.
		
		int x, y, z;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the first angle X: ");
		x=sc.nextInt();
		
		System.out.print("Enter the second angle Y: ");
		y=sc.nextInt();
		
		z = 180 - (x+y);
		System.out.println("Third angle of triangle Z: " +z);
		
		sc.close();

	}

}
