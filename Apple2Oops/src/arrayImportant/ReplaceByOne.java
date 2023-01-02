package arrayImportant;
import java.util.Scanner;
//Replace negative value by one.

public class ReplaceByOne {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter the elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] =sc.nextInt();
		}
		
		System.out.println("Replace zero by one: ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<0)
			{
				a[i]=1;   
			}
			System.out.print(a[i]+" ");
		}
	}

}
