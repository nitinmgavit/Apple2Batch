package demo;

import java.util.Scanner;

public class Even_number {

	public static void main(String[] args) {
		
		// Print all even number till N.
		
		int n; 
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		
		for (int i=0; i<=n; i++) {
			
			if (i % 2 == 0) {
				
				System.out.println(i);
				
				sc.close();
				
			}
		}

	}

}
