package array; 
// 7. Write a Java program to find the common elements between two arrays (int values) 
  //Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 66, 22], 
  //so common between two arrays are 23 and 91 

import java.util.Arrays;

public class CommonElements {
	
	public static void main(String[] args) {
		
		int arr1[] = {12, 23, 34, 67 ,78, 91, 56};
		int arr2[] = {39, 25, 15, 23, 55, 91, 66, 22};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("Common elements are: ");
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i]==arr2[j]) 
				{
					System.out.print(arr2[j]+" ");
				//	System.out.print(arr1[i]+" ");
				}
			}
		}
    }
}

