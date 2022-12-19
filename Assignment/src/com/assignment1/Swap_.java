package com.assignment1;
import java.util.Scanner;

public class Swap_ {

	public static void main(String[] args) {
		
	// 3) Swap values of two integer variables using third variable.
		
		int x, y, z; // we have to swap of values x and y by using z variable.
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value of X before swapping : ");
		x=sc.nextInt();
		
		System.out.print("Enter the value of Y before swapping : ");
		y=sc.nextInt();
		
		// Now Swapping Process
		z=x;
		x=y;
		y=z;
		
		System.out.println("Value of X after swapping : "   +x);
		System.out.println("Value of Y after swapping : "   +y);
		
      sc.close();
	}

}
