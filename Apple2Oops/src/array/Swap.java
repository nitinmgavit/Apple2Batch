package array;
import java.util.Arrays;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter the elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int n=a.length;
		int mid=n/2;
		
		System.out.println("Before Swapping: "+Arrays.toString(a));
		
		for(int i=0; i<mid; i++)
		{
			int temp=a[i];
			a[i]=a[n-2+i];
			a[n-2+i]=temp;
		}
		System.out.println("After Swapping: "+Arrays.toString(a));
	}

}
