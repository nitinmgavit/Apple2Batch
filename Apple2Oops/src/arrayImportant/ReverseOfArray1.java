package arrayImportant;
import java.util.Scanner;

public class ReverseOfArray1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Reverse array: ");
		 for(int i=a.length-1; i>=0; i--) 
		 {		
	         System.out.print(a[i]+" ");		 	                 
	      }	
    }

}
