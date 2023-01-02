package arrayImportant;
import java.util.Scanner;
// Replace negative value by zero.

public class ReplaceWithZero {

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
		
		System.out.println("Replace negative value with zero: ");
		for(int i=0; i<a.length; i++ )
		{
			if (a[i]<0)
			{
				a[i]=a[i]*0; // -> repalce by 0  // a[i]=1; -> replace by 1  // a[i]=a[i-1]*a[i-1]; -> imm sq.
			}
			System.out.print(a[i]+" ");
		}
	}

}
