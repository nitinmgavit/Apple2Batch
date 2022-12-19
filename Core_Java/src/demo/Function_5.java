package demo;


import java.util.Scanner;

public class Function_5{
	
	public static int calculateProduct(int a, int b) {
		
		//int product=a*b;
		//return product;
		   //OR
		return a*b; 
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter The Number a: ");
		int a=sc.nextInt();
		
		System.out.print("Enter The Number b: ");
		int b=sc.nextInt();
		
		int product=calculateProduct(a, b);
		System.out.println("Answer= " +product);
		
	//	System.out.println(calculateProduct(a,b));
		sc.close();
		
		
	}
}




