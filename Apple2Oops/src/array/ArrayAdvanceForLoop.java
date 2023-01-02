package array;
import java.util.Scanner;
public class ArrayAdvanceForLoop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size=sc.nextInt();
		int a[]=new int[size];	
	
		System.out.println("Enter the array elements: ");
	
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements are...");
				
         // Accessing array
	/*	for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}  */
		
		// Advance for loop
		for(int value : a) 
			System.out.print(value +" ");

	}

}
/*  
Enter the size of array: 3
Length of array: 3
Enter the array elements: 
10 20 30
Array elements are...
10 20 30 
*/


// int a[]; -> Array Declaration 
// a= new int[5]; -> Instantiation and Initialization of array
