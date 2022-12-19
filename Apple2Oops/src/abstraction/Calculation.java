package abstraction; 

interface Calculator
{
	void addition (int a, int b);
	void substraction (int a, int b);
	void multiplication(int a, int b);
	void division (int a, int b);	
}

class SciCalculation implements Calculator{
	
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

public class Calculation {
	
	public static void main(String[] args) {
		
		SciCalculation s= new SciCalculation();
		s.addition(50, 35);
		s.substraction(90,67);
		s.multiplication(5, 9);
		s.division(70, 5);
		s.power(5, 3);
		s.sqrt(121);
		s.square(25);
	}

}
