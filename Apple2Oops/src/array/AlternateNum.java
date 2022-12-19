package array;

import java.util.Arrays;

public class AlternateNum {

	public static void main(String[] args) {
		
		int arr[]= { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<=arr.length-1; i+=2 ) // i=i+2
		{			
			System.out.print(arr[i]+" ");
		}
	}

}
