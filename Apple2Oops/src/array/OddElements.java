package array;
import java.util.Scanner;

public class OddElements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
	
		System.out.println("Enter the array elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Odd elements in array: ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");
		}

	}

}
