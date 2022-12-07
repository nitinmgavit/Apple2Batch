package com.pactice;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[]) {
		
		String org, rev=null;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the word: ");
		org =sc.next();
		
		for (int i=org.length()-1; i>=0; i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		
	}

}
