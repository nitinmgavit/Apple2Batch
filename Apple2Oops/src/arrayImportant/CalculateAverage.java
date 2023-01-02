package arrayImportant;
import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter the elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		double total=0;
		for(int i=0; i<a.length; i++)
		{
			total=total + a[i];
		}
		
		double avg =(total/a.length);
		System.out.println("The average is: "+avg);
	}

}
