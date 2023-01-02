package arrayImportant;
import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Size of array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Duplicate elements in array...");
		for(int i=0; i<a.length; i++){
			
		  for(int j=i+1; j<a.length; j++){
			  
			  if(a[i]==a[j])
				 System.out.print(a[j]+" ");
		   }
		  
		}
	}

}
