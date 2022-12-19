package com.writtenAssignment;

public class PrimeNum {

	public static void main(String[] args) {
		// 5.Find all prime number between 400 to 300;
       int count; 
        
       for(int i=400; i>=300; i--) {
    	   count=0;
    	   for(int j=2; j<i; j++) {
    		   if(i%j==0)
    		   {
    			   count++;
    			   break;
    		   }
    	   }
   	
		if(count==0)
    		   System.out.print(i+ " ");
       }
			
	}

}
