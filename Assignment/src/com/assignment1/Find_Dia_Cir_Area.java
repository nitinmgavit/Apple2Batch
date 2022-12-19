package com.assignment1;
import java.util.Scanner;

public class Find_Dia_Cir_Area {

	public static void main(String[] args) {
		
		// By using radius of circle find its diameter, circumference and area.
		
		double radius, diameter, circumference, area;
		//double pi=3.14;
		Scanner sc=new Scanner(System.in); 
		
		System.out.print("Enter the radius: ");
		radius=sc.nextDouble(); 
		
		diameter= 2 * radius;
		circumference= 2 * 3.14 * radius;   // C= 2*pi*r
		area = 3.14 * radius * radius;
		
		System.out.println("Diameter: " +diameter+ "\n" + "Circumference: " +circumference+ "\n" + "Area: " +area);
	
		sc.close();

	}

}
