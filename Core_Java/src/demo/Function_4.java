package demo;

import java.util.Scanner;

public class Function_4 {
	
	// make a function to add 2 numbers and return the sum.
	
	public static void printFactorial(int n) {
		
		if (n < 0) {
			System.out.println("Invalid Number"); // bcoz 0! factorial of zero is 1 and there is no factorial for negative numbers.
			return;
		}
		
		int factorial = 1;
		for (int i=n; i>=1; i--) {   // we go from i=n to i=1 i.e. upto i--
			factorial = factorial *  i;
		}
		
		System.out.println(factorial);
		return;
    } 
	
	public static void main(String args []) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number X: ");
		int n = sc.nextInt();
		
		printFactorial(n);
		
		sc.close();
	}

} /*  n! = n * (n-1) * (n-2) * (n-3) ....*1
     0! = 1
     1! = 1
     2! = 2*1
     3! = 3*2*1 = 6
     4! = 4*3*2*1 = 24
*/
