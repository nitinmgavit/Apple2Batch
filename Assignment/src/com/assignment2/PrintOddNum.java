package com.assignment2;

public class PrintOddNum {

	public static void main(String[] args) {
	//	2) WAP to print odd numbers from 521 to 229 using while loop. 
		
	    for (int num1=521; num1>=229; num1--)
	    {    
	    	if(num1%2!=0)
	    	System.out.print(num1+ " ");
	    }
	    	
	}

}





  /* 
    int num1=521, num2=229;
   
   while(num1>=num2) 
   {
      if(num1%2!=0)      //(521%2 = !(false) = true) //if(!(num1%2==0))
    {     
		System.out.print(num1+" ");
    }
	
	num1--;
   }	
   
   
   
*/