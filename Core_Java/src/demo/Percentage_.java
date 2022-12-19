package demo;

import java.util.Scanner;

public class Percentage_ {

	public static void main(String[] args) {
		// 
		
		int per; // percentage
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the percentage: ");
		 per=sc.nextInt();
		 
		 do {
			 
			 if (per>=75 && per<100) {
				 System.out.println("First Class");
				 
		 } else if (per>=60 ) {
			 System.out.println("Second Class");
			 
		 } else if (per>50) {
			 System.out.println("Third Class");
			 
		 } else if (per>35) {
				 System.out.println("Pass");
				    
		 } else {
			     System.out.println("Fail");
			 
		 }
			 System.out.println();
			 
			 per=sc.nextInt();
			 
		 }  while (per<=100);
		    sc.close();
 
	}

}
