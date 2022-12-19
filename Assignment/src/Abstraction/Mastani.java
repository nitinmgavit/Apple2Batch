package Abstraction;

public class Mastani implements IceCream, Juice {

	@Override
	public void drink()
	{
		System.out.println("Apple Juice is good for health");
		
	}

	@Override
	public void eat()
	{
		System.out.println("Vanilla is a famous IceCream");
		
	}
	
}
