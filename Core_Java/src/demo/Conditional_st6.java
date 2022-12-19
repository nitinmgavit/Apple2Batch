package demo;

// switch condition 

import java.util.Scanner;

public class Conditional_st6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			int Button=sc.nextInt();
			
			switch(Button) {
			case 1 : System.out.println("Hello");
			break;
				
			case 2 : System.out.println("Namaskar");
			break;
			
			case 3 : System.out.println("Namaste");
			break;
			
			default : System.out.println("Invalid Button");
			
			}
			sc.close();
			
			/*  in switch condition if you press the button 1 and if condition is true it shows- break and execute the code
			 *  if condition is false it shows- default and then execute the code
			   
			 */
	}

}

