package arrayImportant;
import java.util.Scanner;

public class PassArrayAsParameter1 {
	
	public void findMaximum(int a[]) {
		
		int max = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			max=a[i];
		}
		System.out.println("Maximum value from array is: " +max);
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size =sc.nextInt();
		int a[] =new int[size];
		
		System.out.println("Enter the array Elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] =sc.nextInt();		
		}
		PassArrayAsParameter1 par=new PassArrayAsParameter1();
		par.findMaximum(a);		
	}

}
