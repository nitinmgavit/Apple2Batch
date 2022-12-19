package array;

import java.util.Arrays;

public class MinValue {
	
public static void main(String[] args) {
		
		int a [] = {20, 12, 31, 45, 100, 15, 105, 90};
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
	  //   System.out.println(Arrays.toString(a)); // it will sort the element
	     System.out.print("Minimum number: "+a[0]);
	     System.out.print("\n2nd Minimum number: "+a[1]);    
	}

}
