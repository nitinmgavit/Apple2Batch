package com.writtenAssignment;

import java.util.Scanner;

public class Box {
	
	// 1.Create class Box and calculate the volume of box volume=length x width x height (create separate method for volume).
	
	void calculateVol() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Values: ");
		int length=sc.nextInt();
		int width=sc.nextInt();
		int height=sc.nextInt();
		
	int	volume=length*width*height;
	System.out.print("Volume of box: " +volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Box b= new Box();
      b.calculateVol();
	}

}
