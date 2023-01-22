package WrapperClasses;
import java.util.Scanner;

public class ThrowExample {
	
	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Roll Number");
	        int rNum = sc.nextInt();

	        if (rNum<=0) {
	        	
	            throw new ArithmeticException("Roll Number Can't Be Negative");    
	        } 
	        else 
	        {
	            System.out.println("This is Valid Roll Number");
               }
       }
 }