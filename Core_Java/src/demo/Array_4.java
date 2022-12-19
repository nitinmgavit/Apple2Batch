package demo;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		// Take an array as input from the user, search for a given number X and print the index at which it occurs.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		
		// for loop to the input
		for ( int i=0; i<size; i++) {
			numbers [i]=sc.nextInt();
		}
		
		int x= sc.nextInt();
		
		// for loop to the output
		for (int i=0; i<numbers.length; i++) {  // each array has a length variable associated with it. 
			                               //it means the property length will be with it in the memory.
			                               // and in this property they save the size of array.
			
			if (numbers[i]==x) {
			
			System.out.println(" X found at index: " +i);
		
			} sc.close();

		}
	}

} /*    input
         Enter the size of array = 4
             [0] 10
             [1] 20
             [2] 30
             [3] 40
                
         output 20
         X found at index [1]
         
             input
         Enter the size of array = 4
          input the 4 values 10, 20, 30, 40.
          search X=30,  now search i=0th index x!= 30 (x is not equal to 30)
          then  i=1ts index x!= 30,  after that search i=2nd index x=30 i.e. 30=30
          then i=3rd index x!= 30 and.. Exit the loop.
          this search in linear manner.              
*/
