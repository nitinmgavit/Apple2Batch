package demo;

import java.util.Scanner;
  //import java.util.*;

public class Conditional_st5 {

	public static void main(String[] args) {
		// else if conditional statement 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println( " Enter The Button");
		int button=sc.nextInt();
		
		if(button==1){
			System.out.println("Hii");
			
		}else if(button==2){
			System.out.println("Hello");
			
		} else if (button==3){
			System.out.println("Namaste");
			
		}else {
			System.out.println("Invalid Button");
			
		} 		   sc.close();
		  
	}	
}
