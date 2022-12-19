package com.assignment1;
import java.util.Scanner;

public class Find_Power {

	public static void main(String[] args) {
		// find power of any number x^y
		
		int base, exponent;
		double power;
		//double power;  //basenumber
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the base number X : ");
		base=sc.nextInt();
		
		System.out.print("Enter the exponent number Y : ");
		exponent=sc.nextInt();
		
		power =Math.pow(base, exponent);
		System.out.println("X to the power Y is: " +power);
		
		sc.close();
	}

}
