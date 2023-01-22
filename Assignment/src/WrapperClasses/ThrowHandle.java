package WrapperClasses;
import java.util.Scanner;

public class ThrowHandle {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your roll number");
        int roll = sc.nextInt();

        try {
            if (roll<=0) 
            {
                throw new ArithmeticException("Roll Number Can't Be Negative");
            } 
            else
            {
                System.out.println("This is Valid roll number");               
            }
                    
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("An exception is thrown");
            System.out.println(e.getMessage());
        }
    }

}
