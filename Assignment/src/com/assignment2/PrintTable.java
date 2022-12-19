package com.assignment2;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
	// 12) WAP to print table of given no.
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		
		for (int i=1; i<=10; i++)
		{
			System.out.print(num*i+ " ");
			sc.close();
		}
		
	}
}
