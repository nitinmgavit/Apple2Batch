package practice;

import java.util.Scanner;

public class Code_2 {

	public static void main(String[] args) {
		
		// Palindrome or not
		
		int num, temp, sum=0; 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		temp=num;
		for(sum=0; num>0; num=num/10 ) {
			
			int rem=num%10;       
			sum=(sum*10)+rem;		    
		}
		if(temp==sum) {
			System.out.println("Palindrome");      // System.out.println(temp +" Palindrome ");	
		}
		else {
			System.out.println("Not Palindrome");     // System.out.println(temp +" Not Palindrome");
		}
	}
}

// No output