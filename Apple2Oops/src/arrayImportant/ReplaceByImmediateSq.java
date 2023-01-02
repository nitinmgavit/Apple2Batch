package arrayImportant;
import java.util.Scanner;
//replace all negative value with its immediate left elements square.

public class ReplaceByImmediateSq {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Array size: ");
		int size=sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] =sc.nextInt();
		}
		
		System.out.println("Replace negative value with immediate sq: ");
		for(int i=0; i<a.length; i++ )
		{
			if (a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];  // condition
			}
			System.out.print(a[i]+" ");
		}
	}

}
