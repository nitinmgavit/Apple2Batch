package demo;

import java.util.Scanner;

public class Function_3 {
	
	// make a function to add 2 numbers and return the sum.
	// so firstly we have to get two numbers from user. which is int a, int b.
	
	public static int calculateSum(int a, int b) {
		int sum= a+b;
		return sum; // this sum is made for calculateSum.
	}
	
    public static void main(String args []) {
    	Scanner sc= new Scanner(System.in); 
    	System.out.print("Enter a number a: ");
    	int a=sc.nextInt();
    	
    	System.out.print("Enter a number b: ");
    	int b=sc.nextInt();
    	
    	int sum= calculateSum(a, b); // this sum is made for main function
    	
    	System.out.println("Answer a+b = " +sum);
    	
    	sc.close();
    } 
}
