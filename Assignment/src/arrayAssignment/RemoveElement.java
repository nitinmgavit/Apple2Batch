package arrayAssignment;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
	
		        int arr[]= {1,2,3,4,5};
		        
		       int arr1[]= new int[arr.length-1];
		        int j=3;
		        
		        for(int i=0, k=0; i<arr.length; i++)
		        {
		            if(i!=j)
		            {
		                arr1[k]=arr[i];
		                k++;
		            }
	         }
		        System.out.println("Before deletion :" + Arrays.toString(arr));
		        System.out.println("After deletion :" + Arrays.toString(arr1));
    }
}