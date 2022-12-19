package demo;

import java.util.Scanner;

public class Strings_ {

	public static void main(String[] args) {
		// String declaration
			
      //  String name;
         String fullName;
         Scanner sc=new Scanner (System.in);
         
       //  System.out.print("Enter the name: ");
     //    name=sc.next();        // string is single token or single word in java, so when we take sc.next() it will print only single word 
    //     System.out.println("My name is: " +name);
         
         System.out.print("Enter the full name: ");
         fullName=sc.nextLine(); // to print full sentence we take sc.nextLine()
         System.out.println("My full name is: " +fullName);
         sc.close();
         
	}

}  /* String name= "Nitin";  -->  string is -> non primitive data type.
       String fullName= "Nitin Gavit"; --> in string space is a valid character
       
    IMPORTANT=   Strings--> Strings are immutable in java. i.e. If we create a string in a memory, it can not be changed.
        means can not be modified or can not be deleted. if we want modify it we have to make one new string  between them.
*/
