package com.assignment2;
import java.util.Scanner;

public class CountDigits {
   public static void main(String[] args) {
	// 8) Write a program to count number of digits in any number.
	   
		 int num,  countFactor=0;
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.print("Enter a number: ");
		 num=sc.nextInt();
		 
		 while(num!=0)
		 {
			 num=num/10;
			 countFactor++;
		 }
		 System.out.println(countFactor);
		 sc.close();
	}

}

/*  
      int num, cf=0;
    Scanner sc=new Scanner(System.in);
    
     System.out.println("Enter a number: ");
	 num=sc.nextInt();
	 
	 for (num!=0; num=num/10; cf++){
	 }
	 syso(cf);
  
 */
