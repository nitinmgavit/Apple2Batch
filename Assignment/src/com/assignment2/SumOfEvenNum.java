package com.assignment2;
import java.util.Scanner;

public class SumOfEvenNum {
	public static void main(String[] args) {
	// 6) Write a program to find sum of all even numbers between 1 to n. 
		
		int i=0, n, sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a first number: ");
		i=sc.nextInt();
		System.out.print("Enter a last number: ");
		n=sc.nextInt();
		
		while(i<=n) 
		{	
		if (i%2==0) 
		{
			sum=sum+i;
	    	}i++;
		}
		System.out.println(sum);
		sc.close();
	}
}
/*
for (int i=0; i<=n; i++) {
	
	if (i % 2 == 0) {
		
		System.out.println(i);
		sc.close();
	*/	

