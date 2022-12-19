package array;

import java.util.Arrays;

//4. WAP to reverse the array itself, don’t print array in reverse – I want current array 
//reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be 
//[78, 37, 29, 45, 90, 3] by using temporary array. 

public class ReverseTemp {

	public static void main(String[] args) {
		
		int arr[] = {3, 90, 45, 29, 37, 78};
		
		int n=arr.length;
		int mid=n/2;
		
	System.out.println(Arrays.toString(arr));
	
		for(int i=0; i<mid; i++) 
		{
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;	
		}
		System.out.println(Arrays.toString(arr));

	}

}
