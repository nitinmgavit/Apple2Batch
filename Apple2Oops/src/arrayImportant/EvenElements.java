package arrayImportant;
import java.util.Scanner;

public class EvenElements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
	
		System.out.println("Enter elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Even elements in array are... ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i] % 2 == 0)
				System.out.print(a[i]+" ");
		}

	}

}
