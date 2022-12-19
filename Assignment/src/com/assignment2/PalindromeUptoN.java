package com.assignment2;
import java.util.Scanner;

public class PalindromeUptoN {
	public static void main(String[] args) {
		// 20) Print all palindrome numbers from 100 to 500
	
		int first, last, rem;
		int num=0, sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("First num: ");
		first=sc.nextInt();
		System.out.print("Last num:");
		last=sc.nextInt();
		
		System.out.print(first+ " to " +last+ "  Palindrome numbers are:");
		
		for(int i=first; i<=last; i++)
		{
			num=i;
			sum=0;
			while (num!=0)
			{
				rem=num%10;
				sum=(sum*10)+rem;
				num=num/10;
			}
			if (i==sum)
				System.out.print(i+ " ");
			sc.close();
		}

	}

}
