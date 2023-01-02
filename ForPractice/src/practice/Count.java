package practice;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		 int count = 0;		
		Scanner sc = new Scanner(System.in);		
		System.out.print("\nEnter the Duplicate Array size  : ");
		int Size = sc.nextInt();
		
		int arr[] = new int[Size];
		
		System.out.format("\nEnter Duplicate Array elements : ", Size);
		for(int i = 0; i < Size; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < Size; i++) 
		{
			for(int j = i + 1; j < Size; j++)
			{
				if(arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("\nTotal Number of Duplicates  = " +count);
	}
}
