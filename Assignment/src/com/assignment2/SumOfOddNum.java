package com.assignment2;

import java.util.Scanner;

public class SumOfOddNum {

	public static void main(String[] args) {
		// 7) Write a program to find sum of all odd numbers between 1 to n
          int i, n, sum=0;
          Scanner sc=new Scanner(System.in);
          
          System.out.print("enter a 1st num: ");
          i=sc.nextInt();
          System.out.println("enter a N^th num: ");
          n=sc.nextInt();
          
          while(i<=n)
          {
        	  if (i%2!=0)
        	  {
        		  sum=sum+i;
        	  }i++;  		   
         } 
          System.out.println(sum);
          sc.close();
	}
}
