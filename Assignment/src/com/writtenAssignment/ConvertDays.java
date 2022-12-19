package com.writtenAssignment;

import java.util.Scanner;

public class ConvertDays {

	public static void main(String[] args) {
	// 2)Write a Java program to convert days into years, weeks and days.
		
		int days, years, weeks;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the days : ");
		days=sc.nextInt();
		
   //Now conversion of days into years, weeks and days.		
		years = (days / 365);
		weeks= (days % 365) / 7;    
		days = (days % 365) % 7;  
		System.out.println("Years:"+years+", "   +"Weeks:"+weeks+", "    +"Days:" +days);
		
		sc.close();
	}

}
