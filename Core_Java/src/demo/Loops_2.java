package demo;

import java.util.Scanner;

public class Loops_2 {
	
	public static void main(String args[]) {
	// by using for loop print 1 to 10 numbers. 
		
		int  n;
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		n=sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.print(i+ " ");
			
			//System.out.println(i);	
			//System.out.println("Nitin"); 
			sc.close();
		}
		
	}

}
/*  A loop is used to execute a block of statement repeatedly 
 until a particular condition is satisfied.   
 for (int i=1;      i<=10;        i++)
      print the     check the     update the
      value         condition      value
 */
