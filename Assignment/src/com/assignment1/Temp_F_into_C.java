package com.assignment1;
import java.util.Scanner;

public class Temp_F_into_C {

	public static void main(String[] args) {
			
	// Temperature in Fahrenheit and convert into Celsius.
			
			double fahrenheit, celsius;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter the Temp in Celsius:");
			fahrenheit=sc.nextDouble();
			
			celsius= (5.0/9.0) * (fahrenheit - 32.0);
			System.out.println("Temp in Celcius is:" +celsius);
			
			sc.close();

	}

}
