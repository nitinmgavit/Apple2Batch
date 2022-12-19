package demo;

import java.util.Scanner;

public class Print_table {

	public static void main(String[] args) {
		
		// Print the table of any number
		int num; 
		int n=10;
		
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the table number : ");
		num=sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print(i*num+ " ");
		}
		sc.close();

	}

}
