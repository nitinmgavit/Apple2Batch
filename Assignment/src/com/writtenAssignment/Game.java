package com.writtenAssignment;

import java.util.Scanner;

public class Game {
	
	/* 3.National game of India is Hockey, China is Table Tennis, Bangladesh is Kabaddi, Italy is Football,
	 United States is baseball. Write a Java program to read country name as user-input and to print the
	country’s national game. Use switch.  */

	void nationalGame(String country) {
		
		switch (country)
		{
		case "India" : 
		System.out.println("National game of India is Hocky: ");
		break;
		
		case "China" :
			System.out.println("National game of China is Table Tennis: ");
		break;
		
		case "Bangladesh" :
			System.out.println("National game of Bangladesh is Kabaddi: ");
			break;
			
		case "Italy" :
			System.out.println("National game of Italy is Football: ");
			break;
			
		case "United States" : 
			System.out.println("National game of US is Baseball: ");
			break;
			
			default :
				System.out.println("Enter the right choice..!");
	}  
 }   
	public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("1.India, \n2.China, \n3.Bangladesh, \n4.Italy, \n5.United State");
        System.out.println("\nEnter The Country Name: ");
        String country=sc.next();
        Game g= new Game();
        g.nationalGame(country);

	}

}
