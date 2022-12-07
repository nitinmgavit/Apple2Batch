package practice;

import java.util.Scanner;

public class VeryImportant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Java"+10+20);  // Java1020 -> first it print String value then its print + (next value) then again it print next value 
		//its not printing the Addition bcoz for this sequence java  thinks + sign is to join next value not for Addition.
		System.out.println(10+20+"Java"); // 30Java -> here Java add 10+20 and then Print String value with them.
		
		int num1, num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num1=sc.nextInt();
		
		for(int i=1; i<=10; i++)

			System.out.print(num1*i+", ");
				
	}

}
