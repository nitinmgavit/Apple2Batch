package practice;

import java.util.Scanner;

public class Code_1 {
	public static void main(String args[]) {
		
       //  Print the sum and avg of digits
		
		int num=0, sum=0, avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		int count = sum;
		// count = 0;
		int rem=0;
		while(num!=0||num>0){
			rem=num%10;
			sum=sum+rem;
			count++;
			num = num /10;
			
		}
		if(count==num) {
			avg = sum/10;
		}
		
		System.out.println(sum);
		System.out.println(avg);

	}
}
