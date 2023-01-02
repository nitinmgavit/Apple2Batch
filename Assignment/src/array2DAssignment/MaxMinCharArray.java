package array2DAssignment;
import java.util.Scanner;

public class MaxMinCharArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String a=new String();
		char max;
		char min;
		a=sc.next();
	
		for(int i=0; i<9; i++)
		{
			System.out.println(a.charAt(i));
		}
		
		max=a.charAt(0);
		min=a.charAt(0);
		
		System.out.println(a.length());
		for(int i=0; i<a.length(); i++)
		{
			if(a.charAt(i)>max)
			{
			   max=a.charAt(i);
			}
		}
		
		for(int i=0;i <a.length(); i++)
		{
			if(a.charAt(i)<min)
			{
			  min=a.charAt(i);
			}
		}
		System.out.println("Maximum Character is " +max);
		System.out.println("Minimum Character is "+min);
    }
}


