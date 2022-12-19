package Abstraction;

public class Juicer extends Machine {

	@Override
	void crush() 
	{
		System.out.println("Crush the mango");		
	}
	
	void filter() 
	{
		System.out.println("Filter the juice");
		
	}
	
}
