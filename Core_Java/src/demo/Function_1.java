package demo;

import java.util.Scanner;

public class Function_1 {
	// print a given name in a function

	public static void printMyName(String name) { // function
		
		System.out.println(name);
	// now this function is end and we have to exit from this code so we use return type of keyword
		return;  // which is inside the curly bracket is called declared function.
	}
	
	public static void main(String args []){ // function
	// now, for this function we get input from user,
	//to get this input we have to create a object of scanner class
		Scanner sc=new Scanner(System.in);
		
		String name=sc.next(); // we get string type name from sc.next
		
		
		printMyName(name); // and now we call the (function name) printMyName from the main function or call kiya function ko.
		
		sc.close();
	}
     
} /*  returnType functionName(type are1, type are2){
       inside the function we can declare firsts its return type like-> int, char, float, string array etc.
       e.g if return type of function is int then we can return integer type variable only.
       if return type of function is void it means it will not return anything.
       
       public or static is keyword in java.
       
       function name--> printMyName --> or identifier 
       arguments/inputs-> firstly we define type of argument for eg. int, string, float, boolean etc and then we declare name of argument
         for eg. int age, float temp. etc.
        
*/
