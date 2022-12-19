package abstraction;

interface Calculator1
{
	void addition (int a, int b);
	void substraction (int a, int b);
	void multiplication(int a, int b);
	void division (int a, int b);	
}

public class SciCalculator {
	
	public void addition (int a, int b) 
	{
		System.out.println("Addition: "+ (a+b));
	}
	
	public void substraction (int a, int b) 
	{
		System.out.println("Substraction: "+(a-b));
	}
	
	public void multiplication (int a, int b) 
	{
		System.out.println("Multiplication: "+(a*b));
	}
	
	public void division (int a, int b) 
	{
		System.out.println("Division: "+(a/b));
	}
	
		public void power(double a, double b) 
		{
			System.out.println("Power: "+ (Math.pow(a, b)));
		}
		
		public void sqrt(int a)
		{
			System.out.println("Square root: "+Math.sqrt(a));
		}
		
		public void square(int a) 
		{
			System.out.println("Square: "+(a*a));
		}
}
