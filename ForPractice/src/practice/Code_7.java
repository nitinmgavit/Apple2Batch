package practice;

import java.util.Scanner;

public class Code_7 {

	public static void main(String[] args) {
		// enter odd num and count them.
		
     int num, cnt=0;
     Scanner sc=new Scanner(System.in);
     System.out.print("Limit: ");
     num=sc.nextInt();
     
     for(int i=1; i<=num; i++) {
    	 
    	 if(i%2!=0) {
    		 System.out.print(i+ ", ");
    		 cnt++;
    	 }
     }
     System.out.print("\n" +cnt);

	}

}  

    //   if(i%3!=0) -->  3 la bhag janarya sodun baki print hotil.

// if(i%3==0 || i%5==0)  --> 3 and 5 ne bhag janarya print hotil fkt.