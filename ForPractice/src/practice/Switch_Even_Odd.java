package practice;

import java.util.Scanner;

public class Switch_Even_Odd {

	public static void main(String[] args) {
	//	Write a Java program to check whether a number is even or odd using switch case
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		
		switch(num%2) {
		
		case 0 : System.out.println(num+ " is an even number: ");
		break;
		
		case 1 : System.out.println(num+ " is an odd number:");
		
		
		
		}sc.close();

	}

}
