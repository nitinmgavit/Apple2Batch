package com.assignment1;
import java.util.Scanner;

public class Years_weeks_days {

	public static void main(String[] args) {
		
    // 4) Write a Java program to convert days into years, weeks and days.
		
		int days, years, weeks;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the days : ");
		days=sc.nextInt();
		
   //Now conversion of days into years, weeks and days.
		
		years = (days / 365);
		
		weeks= (days % 365) / 7;     // this formula will count only those weeks which will be remaining after counting the years.
		
		days = (days % 365) % 7;  // and this formula will count only those days which will be remaining after counting years and weeks.
		
		System.out.println("Years:"+years+", "   +"Weeks:"+weeks+", "    +"Days:" +days);
		
		sc.close();
	} 

} 
/*  
     y = (d / 365);
     w = ( d / 7);  // when we use this formula it will count separately days into weeks. 
     d = ( y * 365 ); // when we use this formula it will count separately days into weeks.
    
 */
