package demo;

import java.util.Scanner;

public class Product_N {
	
public static void main(String[] args) { 
		// Calculate the product of first N natural numbers 
	
		int n, pro=1;    
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st N numbers: ");
		n=sc.nextInt(); 
		
		for (int i=1; i<=n; i++) {
			
			pro=pro*i;    //product*=i;  or product=product*i;
		}
		
		System.out.println("Product of 1st N natural Numbers are: " +pro);

		sc.close();
	}
	
	
}


