package array;
// 8. WAP to swap array like input array is [2, 4, 9, 0] 
//so your output array must be [9, 0, 2, 4]

import java.util.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
		
		int arr[] = {2, 4, 9, 0};
		
		int n=arr.length;
		int mid=n/2;
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<mid; i++) 
		{
			int temp=arr[i];
			arr[i]=arr[n-2+i]; // a[0]=[4-2+0]=3 -> a[0]= 3rd index=9, a[1]=[4-2+1
			arr[n-2+i]=temp;		
		}
		System.out.println(Arrays.toString(arr));
	}

}
