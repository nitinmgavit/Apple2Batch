package arrayImportant;
import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Size of Array: ");
		int size = sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		
		System.out.println("Enter Array1 Elements: ");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter Array2 Elements: ");
		for(int j=0; j<arr2.length; j++)
		{
			arr2[j]=sc.nextInt();
		}
				
		System.out.println("Common elements are: ");
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i]==arr2[j]) 
				{
					System.out.print(arr2[j]+" ");
				
				}
			}
		}
			
	}
			
}


