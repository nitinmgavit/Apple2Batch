package com.assignment1;
import java.util.Scanner;

public class Temp_C_into_F {

	public static void main(String[] args) {
		
		// Temperature in Celsius and convert into Fahrenheit.
		
		double celsius, fahrenheit;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Temp in Celsius:");
		celsius=sc.nextDouble(); // input from user
		
		fahrenheit= (9.0/5.0) * (celsius + 32.0);
		System.out.println("Temp in Fahrenheit is:" +fahrenheit); // output
		
		sc.close();
		
	}

}
