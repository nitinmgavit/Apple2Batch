package WrapperClasses;
import java.util.Scanner;

public class ThrowHandle1 {
	
	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter age");
	        int age = sc.nextInt();

	        try {
	        	
	            if (age < 5) 
	            {
	                throw new ArithmeticException("Not allowed! age is less than 5");
	            } 
	            else if (age > 20) 
	            {
	                throw new ArithmeticException("Not allowed! age is greater than 20");
	            } 
	            else
	            {
	                System.out.println("Welcome!");
	            }
	        } 
	        catch (ArithmeticException e) 
	        {
	            System.out.println("An exception is thrown");
	            System.out.println(e.getMessage());
	        }
	    }

}
