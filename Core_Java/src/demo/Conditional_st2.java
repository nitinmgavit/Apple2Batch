package demo;

// if else code 

import java.util.Scanner; // package

//import java.util.*;

public class Conditional_st2 { // class

	public static void main(String[] args) { // function or method
		// Even and Odd code
		
		Scanner sc=new Scanner(System.in); // scanner  class
		
		System.out.println("Enter the Number"); // optional line
		int x=sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("Even");
			
		}else {
			System.out.println("Odd");
			
		}
		sc.close();

	}

}
