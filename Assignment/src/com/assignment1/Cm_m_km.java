package com.assignment1;
import java.util.Scanner;

public class Cm_m_km {

	public static void main(String[] args) {
		
		// Length in Centimeter and convert into Meter and Kilometer.
		
		double cm, m, km; //centimeter, meter, kilometer;   
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the length:");
		cm = sc.nextDouble();
		
		m= (cm / 100);   // 100cm=1m, 100000cm=1km, 1000m=1km
		km= (cm / 100000);
		
		System.out.println("Length in meter:" +m+ ",  Length in kilometer:" +km+ "\n");
	
		 sc.close();

	}

}
