package com.practice;



import java.util.Scanner;

public class XT {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int value =0;
        for(int i=0;i<t;i++){
        	int  a = in.nextInt();
        	int b= in.nextInt();
        	int  n = in.nextInt();
            for(int j=0;j<=n;j++){
            	for(int k=0;k<=n;k++){
            	 value = value +(a+2^j+n);
            	}
            	
             System.out.print(value+" ");
            
            }
        }
        
        in.close();
            		 
            		 
            		 
            		 
            		 
            		 
             
             
             
             
          
          System.out.println("================================");

	}

}
