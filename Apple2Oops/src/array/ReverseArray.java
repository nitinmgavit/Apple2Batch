package array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

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
		
		//System.out.println("Array elements are: ");
		System.out.println("Input Array :" + Arrays.toString(a));
		for(int i=0; i<a.length; i++)
		{
		//	System.out.print(a[i]+ " ");
		
		}
		
		/* System.out.println("\nReverse array: ");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}  */
		
		 for(int i = 0; i< a.length/2; i++) {
	           
	            int j = a[i];
	            a[i] = a[a.length - i - 1];
	            a[a.length - i - 1] = j;
	        }
		 System.out.println("\nReversed Array :" + Arrays.toString(a));
	}

}
