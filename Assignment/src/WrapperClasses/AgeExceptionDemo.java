package WrapperClasses;
import java.util.Scanner;

public class AgeExceptionDemo {
	
	void ageCheck(int age) throws AgeException
	{
		if(age<18)
		{
		  throw new AgeException("Age is less... not allowed");
		}
		else if(age>=60)
		{
			throw new AgeException("Age is greater... not allowed");
		}
		else
			System.out.println("Enjoy your ride..!");
	}
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the age: ");
			int age=sc.nextInt();
			
			AgeExceptionDemo ad=new AgeExceptionDemo();
			try
			{
				ad.ageCheck(age);			
			}
			catch (AgeException e) {
				e.printStackTrace();
			}
			System.out.println("Done...");	
	}
}
