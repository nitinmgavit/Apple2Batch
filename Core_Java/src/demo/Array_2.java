package demo;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size=sc.nextInt(); 
		int numbers[]=new int [size];
		
		// for loop to the input 
		for (int i=0; i<size; i++) {
			numbers [i]=sc.nextInt();
			
		}
		
	 // for loop to the output
		for (int i=0; i<size; i++) {
			System.out.println(numbers[i]);
		} sc.close();
		
	}

}  /*    input =3            output = 3

               10                   10
               20                   20
               30                   30

*/  