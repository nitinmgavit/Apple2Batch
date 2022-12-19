package demo;

// if- else if condition

import java.util.Scanner; // package

public class Conditional_st4 { // class

	public static void main(String[] args) { // function or method
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if (a==b) 
			System.out.println("Equal");
		
		 else if (a>b) 
			System.out.println("a is greater");
		 
		else 
			System.out.println("b is greater");
		
		sc.close();					
	}
}

/* 
In else_if conditional statement if first condition is true, 
code do not go to check 2nd condition or no need to check remaining other conditions 
But if 1st condition is false condition 2nd will be check (it means 1st and 2nd both condition will be check). 
and then run
		 
*/