package com.assignment1;
import java.util.Scanner;

public class Arithmatic_Opr { 

	public static void main(String[] args) { 
		
// 2) Write a Java program to enter two numbers and perform all arithmetic operations.
		
		double num1, num2;
		Scanner sc=new Scanner(System.in); 
		
		System.out.print("Enter a first number :");
		num1=sc.nextDouble();
		
		System.out.print("Enter a second number :");
		num2=sc.nextDouble();
		 
		 // Arithmetic operations.
		 double sum =num1 +num2;
		 double difference = num1 - num2;
		 double product = num1 * num2;
		 double quotient = num1 / num2;
		 double modulo = num1 % num2;
		 
		 System.out.println("sum :"   +sum);
		 System.out.println("Difference :"   +difference);
		 System.out.println("Product :"   +product);
		 System.out.println("Quotient :"   +quotient);
		 System.out.println("Remainder :"   +modulo);
	//System.out.println("Sum :" +sum+"\n"+"Difference: " +difference+"\n"+"Product: "+product);
	//System.out.println("Sum :" +sum+",   "+"Difference: "+difference+",  "+"Product: "+product); 
		 sc.close();
	}

}
