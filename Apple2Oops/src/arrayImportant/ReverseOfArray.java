package arrayImportant;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Input Array :" + Arrays.toString(a));	
		
	//	System.out.println("Reverse array: ");
		 for(int i=0; i<a.length/2; i++) 
		 {		
	           int temp = a[i];
	           a[i] = a[a.length-i-1];
	           a[a.length-i-1]=temp;		 	                 
	      }	
		 System.out.println("\nReversed Array :" + Arrays.toString(a));
	}

}
