package demo;

import java.util.Scanner;

public class String_concatenation {

	public static void main(String[] args) {
		
	// Concatenation--> means to join two strings
		
		String firstName;
		String lastName;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first name: ");
		firstName=sc.next();
		
		System.out.print("Enter the last name: ");
		lastName=sc.next();
		
		System.out.println("Enter the first and last name: " +firstName+ " " +lastName);
			
       sc.close();
	}

}   /*  
        String firstName= Nitin;
		String lastName= Gavit;
		String fullName= firstName+ " " +lastName;
		syso(fullName.length()); --> output= 11
*/
