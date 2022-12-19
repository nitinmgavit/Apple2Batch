package demo;

// if else code

import java.util.Scanner; // package
// import java.util.*; 

public class Conditional_st1 { // Class

	public static void main(String[] args) {  // Function or Method
		
		Scanner sc = new Scanner(System.in); // Scanner class object
		
		//  to use scanner we need to import package 
		
		System.out.println("Enter the age"); // optional line
		int age = sc.nextInt(); // age input
		
		
		if (age>18){
			System.out.println("Person is adult");
		}
		else {
			System.out.println("Person is not adult");
		}
		
		
		sc.close(); // we use this to close the scanner class
		
		/* if given condition is true if block will be execute otherwise else
 in if_else condition both condition will be check and the run/ execute the code.
 in if else condition given all conditions will be check before execute the code.
 
  */
	}

}
