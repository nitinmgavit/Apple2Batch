package practice;

import java.util.Scanner;

public class Find_Max_no {

	public static void main(String[] args) {
		
// 1) Write a java program to find maximum number from given 3 numbers.
		
		int x, y, z;
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter the 1st number : ");
		x=sc.nextInt();
		
		System.out.print("Enter the 2nd number : ");
		y=sc.nextInt();
		
		System.out.print("Enter the 3rd number :");
		z=sc.nextInt();
		
		if (x>y && x>z) {
			System.out.println("Largest number is: " +x); 
		}
		else if (y>z) {
			System.out.println("Largest number is: " +y);
		}
		
		else {
			System.out.println("Largest number is: " +z);
			
		} sc.close();
		

	}

}
