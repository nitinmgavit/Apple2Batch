package arrayImportant;
import java.util.Scanner;

public class MaxiOfArray {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Elements of array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int max = a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i] > max)
				max = a[i];
		}
		System.out.print("Maximum element: " +max);		
	}

}
