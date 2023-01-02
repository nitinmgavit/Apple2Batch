package array;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size =sc.nextInt();
		char a[] =new char[size];
		
		System.out.println("Enter the array Elements: ");
		for(char i=0; i<a.length; i++)
		{
			a[i] =(char) sc.nextInt();		
		}
	
			for(int i=0; i<a.length; i++) 
			{
				if(a[i]>='A'&& a[i]<='Z')
					System.out.println((char)(a[i]+32)+ " ");
				
				else if(a[i]>='a' && a[i]<='z')
					System.out.println((char)(a[i]-32)+ " ");
				else
					System.out.println("Not Alphabate ");
		    	}	
			}
		
	}


