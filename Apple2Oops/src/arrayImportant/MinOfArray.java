package arrayImportant;
import java.util.Scanner;

public class MinOfArray {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of Array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the arrray elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int min = a[0];  // assume rigth now this is our min value means 'a' of zero is min value.
		for(int i=1; i<a.length; i++)
		{
			if (a[i]<min)
				min=a[i];
		}
		System.out.print("Minimum value: "+min);
	}
}

// logic -> the value from very first position means at 0th index
// which ever element is their assume rigth now this is our minimum value. 
// means 'a' of zero is min value, and then comparing with all elements.
