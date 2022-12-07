package practice;

import java.util.Scanner;

public class Alphabates {

	public static void main(String[] args) {
		
// 3) Write a Java program to input any alphabet and check whether it is vowel or consonant.
		char ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the character: ");
		ch=sc.next().charAt(0);
		
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
			System.out.println("It is a vowel");
		}
		else { 
			System.out.println("It is a consonant");
			
		} sc.close();
	}

} // ch=sc.next().charAt(0);
