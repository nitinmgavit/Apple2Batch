package arrayImportant;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];   // a[] -> input array elements
		
		System.out.println("Enter the elements: ");
		for(int i=0; i<size-1; i++) 
		{
			a[i] = sc.nextInt();
		}
		
		// Finding the missing number
		int sumOfAll = (size*(size+1))/2;
		int sumOfArray = 0;
		
		for(int i=0; i<size-1; i++)
		{
			sumOfArray = sumOfArray+a[i];
		}
		
		int missingNum = sumOfAll - sumOfArray;
		System.out.print("Missing Number is: "+missingNum);
	}

}
