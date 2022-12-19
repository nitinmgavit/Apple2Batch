package array;

import java.util.Arrays;

public class MaxValue {
	
	public static void main(String[] args) {
		
		int a [] = {20, 0, 31, 45, 100, 1, 105, 90};
		System.out.println(Arrays.toString(a));
		
	     for(int i=1; i<a.length; i++)
	     {
	    	 for(int j=0; j<a.length-1; j++)
	    	 {
	    	 if(a[j]> a[j+1])
	    	 {
	    		int temp=a[j];
	    		a[j]=a[j+1];
	    		a[j+1]=temp;
	    	 }
	     }
	     
	   }
	     System.out.println(Arrays.toString(a));
	     System.out.print("Maximum number: "+a[a.length-1]);
	     System.out.print("\n2nd Maximum number: "+a[a.length-2]);    
	}

}
