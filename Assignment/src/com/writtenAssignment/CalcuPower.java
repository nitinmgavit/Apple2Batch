package com.writtenAssignment;

import java.util.Scanner;

public class CalcuPower {

	public static void main(String[] args) {
		//4.WAP to accept base and index from user and calculates power
		
		double base, exponent, power;		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the base number: ");
		base=sc.nextInt();
		System.out.print("Enter the exponent number: ");
		exponent=sc.nextInt();
		
		power =Math.pow(base, exponent);
		System.out.println("Power is: " +power);
		
		sc.close();
	}

}
