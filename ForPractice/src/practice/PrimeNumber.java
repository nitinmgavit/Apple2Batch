package practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// Number is prime or not.
		
         int num, count=0;        
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter The Number: ");
         num=sc.nextInt();
         
         for(int i=2; i<=num/2; i++)
         { 
        	 if(num%i==0)
        	 {
        		 count++;          	
        		 break;
        	 }
         } 
         if(count==0) 
        	 System.out.println("Number is prime");
         
         else
        	 System.out.println("Number is not prime");      
	}

}
