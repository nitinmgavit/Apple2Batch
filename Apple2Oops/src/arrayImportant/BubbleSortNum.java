package arrayImportant;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortNum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Size of array: ");
		int size=sc.nextInt();
		int a[] = new int[size];
			
		System.out.println("Enter elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		// condition
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}					
			}
		}
		System.out.println(Arrays.toString(a)); // array sort.	
		System.out.println("Maximum Number: "+a[a.length-1]);
		System.out.println("Second Maximum Number: "+a[a.length-2]);
		System.out.println("Minimum Number: "+a[0]);
		System.out.println("Second minimum Nmuber: "+a[1]);
		
		
	}
}
