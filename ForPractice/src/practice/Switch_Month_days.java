package practice;

import java.util.Scanner;

public class Switch_Month_days {

	public static void main(String[] args) {
		
 //Write a Java program print total number of days in a month using switch case 
         int month;
       //  int days;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the month number: ");
		 month =sc.nextInt();
		 
		 switch (month) {
		 
		 case 4 : 
		 case 6 : 
		 case 9 :
		 case 11: 
			 System.out.println("Days: 30"); 
		 break;
		 
		 case 1 : 
		 case 3 :
		 case 5 :
		 case 7 :
		 case 8 :
		 case 10:
		 case 12:
			 System.out.println("Days: 31");
			 break;
			 
		 case '2' :
			 System.out.println("Days: 28 or 29");
			 break;
			 
			  
		 }sc.close();
		 
	}

}
